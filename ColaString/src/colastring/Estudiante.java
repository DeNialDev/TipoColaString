/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colastring;

/**
 *
 * @author danie
 */
public class Estudiante {
    
    public String No_Control;
    public String Nombre;
    public float Promedio;

    public Estudiante(String No_Control, String Nombre, float Promedio) {
        this.No_Control = No_Control;
        this.Nombre = Nombre;
        this.Promedio = Promedio;
    }

    public String getNo_Control() {
        return No_Control;
    }

    public void setNo_Control(String No_Control) {
        this.No_Control = No_Control;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getPromedio() {
        return Promedio;
    }

    public void setPromedio(float Promedio) {
        this.Promedio = Promedio;
    }
    
    
    
}
