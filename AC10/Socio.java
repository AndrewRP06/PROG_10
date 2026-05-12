/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades.ud10__colecciones;
import java.util.*;
/**
 *
 * @author PC GAMING
 */
public class Socio implements Comparable<Socio> {
    private String Dni;
    private String Nombre;
    public Socio(String Dni , String Nombre){
        this.Dni = Dni;
        this.Nombre = Nombre;
    }
    
    @Override
        public int hashCode() {
        return Dni.hashCode();
        }
    @Override
        public boolean equals(Object ob){
                return Dni.equals(((Socio) ob).Dni);
        }
        @Override
        public int compareTo(Socio otro) {
        return this.Dni.compareTo(otro.Dni); 
            }
        
            @Override
                public String toString() {
                return "DNI: " + Dni + " Nombre: " + Nombre + "\n";
            }
}
