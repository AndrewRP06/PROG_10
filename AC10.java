/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades.ud10__colecciones;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Set;
/**
 *
 * @author PC GAMING
 */
public class AC10 {
    public static void main(String[] args){
          Map<String, Integer> inventario = new TreeMap<>();
          Set<String> claves = inventario.keySet();
                    inventario.put("BUJ-001", 50); //Ejemplo 
                    Scanner sc = new Scanner(System.in) ;
                    int opcion;
        do{
            System.out.println("1: Alta producto");
            System.out.println("2: Baja producto");
            System.out.println("3: Actualizar stock");
            System.out.println("4: Listar");
            System.out.println("0 para eliminar el programa");
            opcion = sc.nextInt();
            sc.nextLine();
          
           switch (opcion) {
            case 1:
                System.out.println("Introduce el codigo(formato de ejemplo BUJ-001 )");
                String nuevo = sc.nextLine().toUpperCase(); //UpperCase para que conserve el formato de mayusculas, no hay de mas, es estetico
                if(!inventario.containsKey(nuevo)){ //no hay nada que explicar, ! dis-tinto ya esta
                            System.out.println("Cantidad inicial");
                            inventario.put(nuevo, sc.nextInt());
                        }else{
                        System.out.println("Ya existe");
                    }
            break;
                    
            case 2:
                    System.out.println("Codigo a eliminar");
                    String eliminar = sc.nextLine().toUpperCase();
                        inventario.remove(eliminar) ;
                    System.out.println("Se ha eliminado correctamente"); 
            break ;
            
            case 3:
                    System.out.println("Codigo");
                    String cod_actu = sc.nextLine().toUpperCase();
                    System.out.println("Cantidad a actaulizar");
                    int nuevoac = sc.nextInt();
                        inventario.put(cod_actu , nuevoac ) ;
                    System.out.println("Se ha eliminado correctamente"); 
            break ;
            
            case 4 :
                System.out.println("Listar");
                
               for (String codigo : claves) {
        Integer stock = inventario.get(codigo); // Buscamos el valor para esa clave
        System.out.println("Código: " + codigo + " | Unidades: " + stock);
    }
             break;
           }
      
        } while(opcion != 0);
                System.out.println("Programa finalizado.");
        sc.close(); //En que estrella estara el try-cath-resources
    }
}