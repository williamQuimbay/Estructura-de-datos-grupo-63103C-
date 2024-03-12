/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas_enlazadas;

/**
 *
 * @author ODIN
 */
public class lista {
    
    //lista simple
    private nodo primero;
    private int numElem; 
    
public lista(){ 
    primero = null;
    numElem = 0;
}



//metodo insertar final 
public void insertarFinal (int elemento){ 
    nodo nuevo = new nodo(elemento, null);
    if (primero == null){
    primero = nuevo;
    }
    else {
        nodo actual = primero;
        while (actual.getSig()!= null){
            actual = actual.getSig();
            
        }
        actual.setSig(nuevo);
        numElem++;
    }
}

//metodo borrar
public void borrar (int elem){
    if (primero == null) 
        System.out.println("lista vacía");
    else
        if (primero.getElemento()== elem){
        primero = primero.getSig();
        numElem--;
        }
        else {
            nodo actual = primero;
            while (actual.getSig()!=null && actual.getSig().getElemento() != elem)
                actual = actual.getSig();
                if (actual.getSig()== null )
                    System.out.println ("elemento "+elem+" no esta en la lista");
                else{
                    actual.setSig(actual.getSig().getSig());
                    numElem--;
                }
        }
} 

//metdo listar
public void listar(){
    
    nodo actual = primero;
    while (actual.getSig()!= null){
        System.out.println(actual.getElemento());
        actual = actual.getSig();
    
    }
    System.out.println(actual.getElemento());
}

}
