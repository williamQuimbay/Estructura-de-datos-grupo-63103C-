/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author ODIN
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
 
public static void main(String[] args) {
    Archivo archivo = new Archivo();
    List<Integer> datos = archivo.cargarDatosDesdeArchivo();
    archivo.ordenarDatos(datos);
    try {
        archivo.escribirDatosEnArchivo(datos);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}

