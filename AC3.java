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
public class AC3 {
      public static void main(String[] args) {
        
        Collection<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numeros.add(random.nextInt(10) + 1);
        }
        System.out.println("Colección con repetidos: " + numeros);
        Collection<Integer> sinRepetidos = new ArrayList<>();
        for (int n : numeros) {
            if (!sinRepetidos.contains(n)) {
                sinRepetidos.add(n);
            }
        }

        System.out.println("Colección sin repetidos: " + sinRepetidos);
    }
}
