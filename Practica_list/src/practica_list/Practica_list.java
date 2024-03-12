package practica_list;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ODIN
 */
public class Practica_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<String>(); 
        nombres.add("juan");
        nombres.add("maria");
        nombres.add("jose");
        nombres.add("miguel");
        nombres.add("alejandra");
        
        //CANTIDAD DE ELEMENTOS 
        
        System.out.println("CANTIDAD DE ELEMENTOS EN LA LISTA: "+nombres.size()+"\n");
        
        
        //ELEMENTOS EN LA LISTA
        
        System.out.println("ELEMENTOS EN LA LISTA ORIGINAL"); 
        mostrarLista(nombres);
        
        //ACTUALIZAR ELEMENTOS
        
        int indiceEditar = 0;
            String nuevoValor = "milton";
            editar(nombres, indiceEditar, nuevoValor);
            System.out.println("\nLISTA DESPUES DE EDICION");
            mostrarLista(nombres);
        
        //ELIMINAR ELEMENTO DE LA LISTA   
        
        eliminar(nombres, "miguel");
        System.out.println("\nELEMENTOS EN LA LISTA DESPUES DE ELIMINAR ELEMENTO");
        mostrarLista(nombres);
        
        //AGREGAR ELEMENTO DE LA LISTA  
        
        agregar(nombres, "william");
        System.out.println("\nLISTA DESPUES DE ADICIONAR ELEMENTO");
        mostrarLista(nombres);
}
    //Metodo para mostrar
    
  private static void mostrarLista(List<String> nombres){
      for (int i = 0; i <= nombres.size()-1; i++)
      {
          System.out.println(nombres.get(i));
      }
  }
  
    //Metodo para editar 
  
  private static void editar(List<String> nombres, int indice, String nuevoValor){
  
   if (indice >= 0 && indice < nombres.size()) {
                nombres.set(indice, nuevoValor);
            } else {
                System.out.println("Índice fuera de rango");
       }
           
    } 
    
     //*Metodo para elimnar
  
  private static void eliminar(List<String> nombres, String nuevoDato){
    nombres.remove(nuevoDato);
}
  
   private static void agregar(List<String> nombres, String nuevo){
    nombres.add(nuevo);
  
  
}

}