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
public class A10  {
    public static void main(String[] args){
    Set<Socio> socios = new HashSet<>();
    socios.add(new Socio("12345678A", "Juan Perez"));
        socios.add(new Socio("87654321B", "Maria Lopez"));
        socios.add(new Socio("11111111C", "Carlos Ruiz"));
        socios.add(new Socio("12345678A", "Juan Duplicado"));
        
        System.out.println("Numero de socios en el conjunto: " + socios.size());
        System.out.println("\nLista de socios:");
        for (Socio s : socios) {
            System.out.println(s);
        }
    }
}
