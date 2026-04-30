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
public class AC4 {
          public static void main(String[] args) {
        
        Collection<Integer> numeros = new ArrayList<>();
       
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            numeros.add(random.nextInt(10) + 1);
        }
         System.out.println("Colección: " + numeros);
         
          Iterator<Integer> it = numeros.iterator(); 
         while(it.hasNext()){
                Integer c = it.next();
              if (c.equals(5)){
                  it.remove();
              }
                  
         }
         System.out.println("Sin cincos: " + numeros);

                   
  }
}
