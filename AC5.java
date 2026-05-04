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
public class AC5 {
  public static void main(String[] args) {
        
        Collection<Integer> numeros = new ArrayList<>();
       Collection<Integer> risa_tailandes = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < 100; i++) {
            numeros.add(random.nextInt(10) + 1);
        }
         System.out.println("Colección: " + numeros);
         
         
         // añadimos 100 porque somos unos maleantes 
          for (int i = 0; i < 100; i++) {
            risa_tailandes.add(5);
        }
         System.out.println("ColecciOn: " + risa_tailandes);
         
  

        
         numeros.removeAll(risa_tailandes);
         System.out.println("Sin cincos" + numeros );
                   
  }
}
