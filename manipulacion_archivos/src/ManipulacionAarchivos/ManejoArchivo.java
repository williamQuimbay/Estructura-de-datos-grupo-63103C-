/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManipulacionAarchivos;
import java.io.*;
/**
 *
 * @author ODIN
 */
public class ManejoArchivo {
    
    //CREAR UNH ARCHIVO
    public static void CrearArchvos(String NombreArchvo) {
        PrintWriter salida = null;

        try
        {
            File Archivo = new File(NombreArchvo);
            salida = new PrintWriter(Archivo);
            System.out.println("Se creo el archivo en la ruta: " + Archivo + "\n");
            
        } catch (FileNotFoundException ex)
        {
            ex.printStackTrace(System.out);
        } finally
        {
            salida.close();
        }
    }
    
        //EDITAR EL CONTENIDO DEL ARCHIVO
    
        public static void EditarArchvos(String NombreArchvo, String contenido) {
       
        
        PrintWriter salida = null;
        
        try
        {
            File Archivo = new File(NombreArchvo);
            salida = new PrintWriter(new FileWriter(Archivo, true));
            salida.println(contenido);
            System.out.println("Se edito el archivo\n");
            
        } catch (FileNotFoundException ex)
        {
            ex.printStackTrace(System.out);
        } catch (IOException ex)
        {
            ex.printStackTrace(System.out);
        } finally
        {
            salida.close();
        }
    }
        //LEER LOS DATOS DE UN ARCHIVO
        
    public static void LeerArchvos(String NombreArchivo) {
        File Archivo = new File(NombreArchivo);
        PrintWriter salida = null;
        System.out.println("Contenido del archivo:");
        
        try
        {
            BufferedReader entrada = new BufferedReader(new FileReader(Archivo));
            String lectura = entrada.readLine();
            while (lectura != null)
            {
                 System.out.println(lectura);
                 lectura = entrada.readLine();
               
                 
            }  
            entrada.close();
            
        } catch (FileNotFoundException ex)
        {
            ex.printStackTrace(System.out);
        } catch (IOException ex)
        {
            ex.printStackTrace(System.out);
        }
    }
    
    
        //ELIMINAR EL ARCHIVO
    
     public static void EliminarArchvos(String NombreArchivo) {
      
        File Archivo = new File(NombreArchivo);
        
        Archivo.delete();
         System.out.println("se a eliminado el archivo de la ruta: " + Archivo);
        
    }
}
 