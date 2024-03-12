
package randonacces;
   import java.io.FileNotFoundException;
   import java.io.IOException;
   import java.io.RandomAccessFile;
   import java.util.ArrayList;

/**
 *
 * @author ODIN
 */
public class randon1 {
 
     public static void main(String[] args) {

        ArrayList<RandonAcces> productos = new ArrayList<>();

       
        productos.add(new RandonAcces(1, "pera", 50.5,'f'));
        productos.add(new RandonAcces(2, "mora", 10.5,'v'));
        productos.add(new RandonAcces(3, "lulo", 30.5,'v'));
        
        
        //crear archivo
        try (RandomAccessFile archivo = new RandomAccessFile("C:\\universidad\\ESTRUCTURAS\\Practicas\\Guardar Archivos\\randonAcces.bat", "rw")) {

            //escribir en el archivo.
            for (RandonAcces p : productos) {
                archivo.writeInt(p.getId());
                
                
                StringBuilder sb = new StringBuilder(p.getNombre());
                sb.setLength(10);
                
                archivo.writeChars(sb.toString());
                archivo.writeDouble(p.getPrecio());
                archivo.writeChar(p.getTipo());

            }
            //peso de cada registro
            // 4 + 20 + 8 + 2 = 34 bytes cada registro 
            archivo.seek(34);

            System.out.println("id: "+archivo.readInt());
            String nombre = "";
            for (int i = 0; i < 10; i++) {
                nombre += archivo.readChar();
            }
            
            //imprimir resultados
            System.out.println("nombre: "+ nombre);
            System.out.println("precio: "+archivo.readDouble());
            System.out.println("tipo: "+archivo.readChar());

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


