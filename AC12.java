/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades.mavenproject1;
import java.util.*;
/**
 *
 * @author ALUMNO
 */
public class AC12 {
    public static void main(String[] args){
    List<Integer> numeros = new ArrayList<>(Arrays.asList(1000 , 50 , 500, 50 , 200));
    System.out.println("Lista" + numeros);
    int cantpremios = Collections.frequency(numeros , 50);
    System.out.println("Hay premios de 50:" + cantpremios );
    int max = Collections.max(numeros);
    System.out.println("El premio maximo: " + max );
    Collections.shuffle(numeros);
    System.out.println("lista" + numeros);
    Collections.sort(numeros);
    System.out.println("Lista ordenada" + numeros);
   System.out.println("Lista ordenada " + Collections.binarySearch(numeros,500));
    }
}
