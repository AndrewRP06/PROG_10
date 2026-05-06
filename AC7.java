/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades.mavenproject1;
import java.util.* ;
/**
 *
 * @author ALUMNO
 */
public class AC7 {
     public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>(Arrays.asList(10 , 20 , 30 , 40));
        List<Integer> lista2 = new ArrayList<>(Arrays.asList(99 , 99));
        List<Integer> lista3 = new ArrayList<>(Arrays.asList(5));
        
        System.out.println("Apartado1: " + lista1);
        System.out.println("Apartado2: " + lista2);
        lista1.addAll(0, lista3);
        System.out.println("Apartado3: " + lista1);
        lista1.addAll(2, lista2);
        System.out.println("Apartado4: " + lista1);       
        System.out.println("Apartado5: " + lista1.get(4));    
        int sustituido = lista1.set(lista1.size()-1 , 500) ;
        System.out.println("Apartado6 : " + lista1 + " guardado en la variable sustituido");
        lista1.remove(1) ;
        System.out.println("Apartado7 " + lista1 );
        lista1.remove(lista1.indexOf(99));
        System.out.println("Apartado8 " + lista1 );
     }
}
