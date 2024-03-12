package proyecto1;

import java.util.ArrayDeque;
import java.util.Deque;

public class EstructurasDeDatos {

    // Método para utilizar arreglos
    public void utilizarArreglos(int[] arreglo) {
        // Lógica de manipulación de arreglos
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Elemento " + i + ": " + arreglo[i]);
        }
    }

    // Método para utilizar colas
    public void utilizarColas() {
        Deque<Integer> cola = new ArrayDeque<>();
        // Lógica de manipulación de colas
        cola.push(1);
        cola.push(2);
        cola.push(3);

        while (!cola.isEmpty()) {
            System.out.println("Elemento: " + cola.pop());
        }
    }

    // Método para utilizar pilas
    public void utilizarPilas() {
        Deque<Integer> pila = new ArrayDeque<>();
        // Lógica de manipulación de pilas
        pila.push(1);
        pila.push(2);
        pila.push(3);

        while (!pila.isEmpty()) {
            System.out.println("Elemento: " + pila.pop());
        }
    }
}