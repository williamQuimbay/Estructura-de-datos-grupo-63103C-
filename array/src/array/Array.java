
package array;
import java.util.Arrays;
/**
 *
 * @author ODIN
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

            // Crear un array

            String[] nombres = {"william", "jose", "martin", "daniel", "alejandra"};

            // Mostrar el contenido

            System.out.println("array original:");
            mostrarArray(nombres);

            // Editar un elemento

            int indiceEditar = 0;
            String nuevoValor = "milton";
            editarElemento(nombres, indiceEditar, nuevoValor);


            //* Mostrar el contenido

            System.out.println("\nContenido del array después de la edición:");
            mostrarArray(nombres);

            // Eliminar un elemento

            int indiceEliminar = 3;
            nombres = eliminarElemento(nombres, indiceEliminar);

            // Mostrar el contenido

            System.out.println("\nContenido del array después de la eliminación:");
            mostrarArray(nombres);
        }

        // Método para mostrar

        private static void mostrarArray(String[] nombres) {
            System.out.println(Arrays.toString(nombres));
        }

        // Método para editar

        private static String[] editarElemento(String[] nombres, int indice, String nuevoValor) {
            if (indice >= 0 && indice < nombres.length) {
                nombres[indice] = nuevoValor;
            } else {
                System.out.println("Índice fuera de rango");
            }
            return nombres;
        }

        // Método para eliminar

        private static String[] eliminarElemento(String[] nombres, int indice) {
            if (indice >= 0 && indice < nombres.length) {
                String[] nuevoArray = new String[nombres.length - 1];
                int nuevoIndice = 0;

                // Copiar los elementos
                for (int i = 0; i < nombres.length; i++) {
                    if (i != indice) {
                        nuevoArray[nuevoIndice] = nombres[i];
                        nuevoIndice++;
                    }
                }

                return nuevoArray;
            } else {
                System.out.println("Índice fuera de rango.");
                return nombres;
            }
        }
    }
