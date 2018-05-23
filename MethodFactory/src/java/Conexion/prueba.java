/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import static Conexion.ConexionSingleton.getConnection;
import java.util.ArrayList;
import modelo.Pais;

/**
 *
 * @author LABO08
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        getConnection();
        AccesoDatos acceso = new AccesoDatos();
        ArrayList <Pais> paises = acceso.listPaises();
        
        for(Pais pro: paises) {
            
            System.out.print(pro.getIdPais() + " ");
            System.out.println(pro.getPais());
            
            
        }
    }
    
}
