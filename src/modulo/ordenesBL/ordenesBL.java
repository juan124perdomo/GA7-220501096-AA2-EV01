/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo.ordenesBL;

/**
 *
 * @author juanz
 */
public class ordenesBL {

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo_de_orden() {
        return tipo_de_orden;
    }

    public void setTipo_de_orden(String tipo_de_orden) {
        this.tipo_de_orden = tipo_de_orden;
    }
    
    int ID;
     String nombre, fecha, tipo_de_orden;
}
