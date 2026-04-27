/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package actividades.ud10__colecciones;
import java.util.* ;

/**
 *
 * @author PC GAMING
 */
public class AC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collection<Integer> numeros = new ArrayList<>();

        
        System.out.println("Escribe un numero, porfa no negativo el primero porque no tendria gracia");

        int num;
        do {
            System.out.println("Numero: ");
            try { num = sc.nextInt();
                    if (num != -1) {
                       if (num < 0) {
                            System.out.println("Número negativo ignorado (solo se admiten no negativos o -1 para salir).");
                    }        else {
                                    numeros.add(num);
                                 }
                     }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida, introduce un número entero.");
                                sc.nextLine(); 
                                                 num = 0;      
           }
        } while (num != -1);

        System.out.println("Coleccion completa: " + numeros);

        System.out.print("Valores pares: ");
                        for (int n : numeros) {
                                if (n % 2 == 0) {
                                          System.out.print(n + " ");
                                          }
                                        }

       System.out.println("");
       
       Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
             int elemento = it.next();
                  if (elemento % 3 == 0) {
                            it.remove();
                        }
                 }
        System.out.println("Coleccion sin multiplos de 3: " + numeros);
    }
}