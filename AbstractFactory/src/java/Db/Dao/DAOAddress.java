/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Db.Dao;

import Db.Conexion.dbConexion;
import Db.IDao.IDAOAddress;
import Db.Modelos.Address;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class DAOAddress implements IDAOAddress{

    @Override
    public ArrayList<Address> getListAddress() {
        Connection c=dbConexion.getConnection();
        PreparedStatement st;
        String sql="select address_id,address,district from address";
        ResultSet rs;
        ArrayList<Address> aux=new ArrayList<>();
        try{
            st=c.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                aux.add(new Address(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
        return aux; 
    }
    
}
