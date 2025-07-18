/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo.ordenesDAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



/**
 *
 * @author juanz
 */
public class conexion {
    
    String strConexionDB = "jdbc:sqlite:C:/Users/juanz/Desktop/java-modulos/modulo/db/bd-modulo.db";
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
    
    public int ejectutarSentanciaSql(String strSentenciaSQL){
        try {
          PreparedStatement pstm= conn.prepareStatement(strSentenciaSQL);
          pstm.executeUpdate();
          return 1;
                    
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }
   
}
