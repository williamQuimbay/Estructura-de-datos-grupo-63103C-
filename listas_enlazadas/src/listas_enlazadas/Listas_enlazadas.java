/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas_enlazadas;


/**
 *
 * @author ODIN
 */
public class Listas_enlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
             
       // creacion de lista
      lista nodo1= new lista();
      nodo1.insertarFinal(2);
      nodo1.insertarFinal(3);
      nodo1.insertarFinal(1);
      nodo1.insertarFinal(4);
      
      System.out.println("Listamos desde original");
      nodo1.listar();
      System.out.println("Borramos un Elemento");
      nodo1.borrar(4);
      nodo1.borrar(5);
      System.out.println("volvemos a listar");
      nodo1.listar();
    }
}


