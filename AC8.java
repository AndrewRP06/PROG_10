/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades.ud10__colecciones;
import java.util.* ;
/**
 *
 * @author PC GAMING
 */
public class AC8 {
    public static void main(String[] args){ 
                    List<String> ListaA = new ArrayList<>(Arrays.asList("Ana", "Luis", "Marta", "Luis"));
                   List<String> ListaB = new ArrayList<>(Arrays.asList("Ana", "Luis", "Marta", "Luis"));
               
                    System.out.println( "Lista 1 " + ListaA) ;
                    System.out.println("Lista 2 "+ListaB) ;
                    
                    System.out.println("Iguales " + ListaB.equals(ListaA) );
                    System.out.println("Posicion primera Luis " + ListaB.indexOf("Luis"));
                    System.out.println("Posicion ultima Luis " + ListaB.lastIndexOf("Luis"));
                    
                    ListaA.sort(null);
                    System.out.println("orden natural " + ListaA);
                    System.out.println("Iguales " + ListaA.equals(ListaB) );
                    ListaB.sort(Comparator.reverseOrder()) ;
                    System.out.println("Ordenar de Z a la A , listaB " + ListaB );
    } 
}
