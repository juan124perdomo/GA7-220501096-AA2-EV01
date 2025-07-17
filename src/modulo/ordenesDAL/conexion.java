/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo.ordenesDAL;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author juanz
 */
public class conexion {
    
    String strConexionDB = "jdbc:sqlite:db/bd-modulo.s3db";
    Connection conn= null;
    
    public conexion() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn= DriverManager.getConnection(strConexionDB);
            System.out.println("Conexion establecida :) ");
                    
        } catch (Exception e) {
            
            System.out.println("Error de coneccion :( "+e);
        }
    }
   
}
