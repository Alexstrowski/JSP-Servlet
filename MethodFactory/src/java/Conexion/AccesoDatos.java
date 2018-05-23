
package Conexion;

import Factory.FactoryPersona;
import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.Driver;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import modelo.Pais;
import modelo.Persona;

public class AccesoDatos {


    public ArrayList listCustomer(String pais) {
        
        Connection conn = ConexionSingleton.getConnection();
        ArrayList<Persona> personas=new ArrayList<Persona>();
        
        String sql = "SELECT \n" +
"    c.first_name, c.last_name, a.address, y.city\n" +
"FROM\n" +
"    customer c\n" +
"        JOIN\n" +
"    address a ON c.address_id = a.address_id\n" +
"        JOIN\n" +
"    city y ON a.city_id = y.city_id\n" +
"        JOIN\n" +
"    country o ON y.country_id = o.country_id\n" +
"WHERE\n" +
"    o.country_id = ? ";

        PreparedStatement pstm = null;

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, pais);
            

            ResultSet resultSet = pstm.executeQuery();
            FactoryPersona fp = new FactoryPersona();
            while (resultSet.next()) {
                String nombre = resultSet.getString(1);
                String apellido = resultSet.getString(2);
                String direccion = resultSet.getString(3);
                String ciudad = resultSet.getString(4);
 
                Persona per = fp.crearPersona();
                per.setNombre(nombre);
                per.setApellido(apellido);
                per.setDireccion(direccion);
                per.setCiudad(ciudad);
                personas.add(per);
            }

            return personas;
        } catch (SQLException e) {
            System.out.println("Error crear la sentencia"
                    + e.getMessage());
        }

        return null;
    }
    
    
    public ArrayList listPaises(){
        
        Connection conn = ConexionSingleton.getConnection();
        ArrayList<Pais> paises=new ArrayList<Pais>();
        Statement statement = null;
        try {
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT country_id, country from country");
            int count = 0;

            while (resultSet.next()) {
                Pais p = new Pais();
                count++;
                p.setIdPais(resultSet.getInt(1));
                p.setPais(resultSet.getString(2));
                
                paises.add(p);
            }

            return paises;
        }catch (SQLException e) {
            System.out.println("Error crear la sentencia "
            + e.getMessage());
        }
        return null;
    }
}
