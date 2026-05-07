/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades.mavenproject1;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;


/**
 *
 * @author ALUMNO
 */
public class AC9 {
    public static void main(String[] args){
        Random random = new Random();
        List<Integer> lista1 = new ArrayList<>();
        
        for (int i = 0 ; i < 30 ; i ++){
         lista1.add(random.nextInt(100) + 1);
        } ;
        System.out.println("Apartado2 " + lista1);

// APARTADO 2         
        Set<Integer> unalistafeliz = new HashSet<Integer>(lista1);
        
        System.out.println("Apartado3" +unalistafeliz +  " es un set no ordena");
       

// APARTADO3       
        Set<Integer> labusquedademiPared = new TreeSet<>(unalistafeliz);
        System.out.println("Apartado3" + labusquedademiPared  );  
        
// APARTADO 4
        Set<Integer> linkedHashSet = new LinkedHashSet<>(lista1);
        System.out.println("Apartado5: " + linkedHashSet + " (orden de insercion, sin duplicados)");
    }
}
