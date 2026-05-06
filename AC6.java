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
public class AC6{
        public static void main(String[] args) {
            Collection <Integer> numero = new ArrayList <> () ;
            Random random = new Random() ;
            
            
            for(int i = 0 ; i < 20 ; i++){
                numero.add(random.nextInt(100) + 1);
            }
      System.out.println("NUMEROS" + numero) ;
        
         Integer[] numero2 = numero.toArray(new Integer[0]) ;
        Arrays.sort(numero2);
         System.out.println(Arrays.toString(numero2));
        
         Collection <Integer> numero3 = new ArrayList<> (Arrays.asList(numero2)) ;
         
               System.out.println("NUMEROS PARTE 3" + numero3) ;
          
               
             Arrays.sort(numero2, Collections.reverseOrder());
                     System.out.println(Arrays.toString(numero2));
        } 
}
