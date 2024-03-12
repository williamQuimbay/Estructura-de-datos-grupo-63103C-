/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas;

/**
 *
 * @author ODIN
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Main {

    public static void main(String[] args) {

        Stack<pila> pila = new Stack<pila>();
       

        pila l1 = new pila("guayaba");
        pila l2 = new pila("limon");
        pila l3 = new pila("naranja");
        pila l4 = new pila("pera");
        pila l5 = new pila ("manzana"); 

        pila.push(l4); // adiciona un fruta a la pila
        pila.push(l2);
        pila.push(l3);
        pila.push(l1);
        pila.push(l5);
                      
        System.out.println("el primer elmento es: " + pila.pop().getfruta()+"\n");
        
        System.out.println("el ultimo elemento adicionado: "+ pila.peek().getfruta()+"\n");
      
        System.out.println("cantidad de elementos de la pila " + pila.size());
    
        while (!pila.isEmpty()) { // mostrar pila completa
            System.out.println(pila.pop().getfruta()); // extrae un elemento de la pila
        }  
       
        System.out.println("\n*******cola**********\n");
        // Crear una cola
        Queue<String> cola = new LinkedList<>();

        // Agregar elementos a la cola
        cola.add("manzana");
        cola.add("banana");
        cola.add("cereza");
        cola.add("durasno");
        cola.add("melon");

        // Quitar un elemento de la cola
        String elementoQuitado = cola.element();
        System.out.println("primer Elemento de la cola: " + elementoQuitado);

        // Ver el próximo elemento de la cola sin quitarlo
        System.out.println("Próximo elemento: " + cola.peek());
        
        //ver la cola completa
        System.out.println("La cantidad de elementos en la cola es: " + cola.size());
    }
}  



        
    
