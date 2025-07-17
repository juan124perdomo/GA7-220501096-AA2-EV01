/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo;

import modulo.ordenDAL.Conexion;
import java.sql.Connection;

/**
 * @author juanz
 */
public class Modulo {

  
    public static void main(String[] args) {
       Connection con = Conexion.obtenerConexion();
    }
    
}
