/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas_enlazadas;

/**
 *
 * @author ODIN
 */
public class nodo {
    //nodo
    private int elemento;
    private nodo siguiente;

public nodo (int elem, nodo sig){
    elemento = elem;
    siguiente = sig;
}
public int getElemento(){
    return elemento;
}
public nodo getSig(){
    return siguiente;
}
public void setElemento(int elem){
    elemento = elem;
}
public void setSig(nodo sig){
    siguiente = sig;
}

}






