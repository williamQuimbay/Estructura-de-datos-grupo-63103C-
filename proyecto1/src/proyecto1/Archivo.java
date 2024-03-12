package proyecto1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Archivo {

    private static final String ARCHIVO_ENTRADA = "datos.txt";
    private static final String ARCHIVO_SALIDA = "salida.txt";
    private static final int TAMANIO_BLOQUE = 10;


    public void ordenarDatos(List<Integer> datos) {
        List<List<Integer>> bloques = dividirEnBloques(datos);
        ordenarBloques(bloques);
        mezclarBloques(datos);
    }

    private List<List<Integer>> dividirEnBloques(List<Integer> datos) {
        List<List<Integer>> bloques = new ArrayList<>();
        int inicio = 0;

        while (inicio < datos.size()) {
            int fin = Math.min(inicio + TAMANIO_BLOQUE, datos.size());
            bloques.add(datos.subList(inicio, fin));
            inicio += TAMANIO_BLOQUE;
        }

        return bloques;
    }

    private void ordenarBloques(List<List<Integer>> bloques) {
        for (List<Integer> bloque : bloques) {
            ordenarInternamente(bloque);
        }
    }

    private void ordenarInternamente(List<Integer> bloque) {
        
         int n = bloque.size();
        for (int i = 1; i < n; i++) {
            int key = bloque.get(i);
            int j = i - 1;
            while (j >= 0 && bloque.get(j) > key) {
                bloque.set(j + 1, bloque.get(j));
                j--;
            }
            bloque.set(j + 1, key);
        }
    }
    

    private void mezclarBloques(List<Integer> datos) {
        int numeroDeBloques = datos.size();
        for (int i = 0; i < numeroDeBloques - 1; i += 2) {
            mezclarDosBloques(datos, i, i + 1, Math.min(i + 2, numeroDeBloques));
        }
    }

    private void mezclarDosBloques(List<Integer> datos, int inicioBloque1,  int inicioBloque2, int finBloque2) {
        int i = inicioBloque1;
        int j = inicioBloque2;
        int k = 0;

        List<Integer> bloqueMezclado = new ArrayList<>();

        while (i < datos.subList(inicioBloque1, inicioBloque2).size() && j < datos.subList(inicioBloque2, finBloque2).size()) {
            if (datos.get(i) <= datos.get(j)) {
                bloqueMezclado.add(datos.get(i));
                i++;
            } else {
                bloqueMezclado.add(datos.get(j));
                j++;
            }
            k++;
        }

        while (i < datos.subList(inicioBloque1, inicioBloque2).size()) {
            bloqueMezclado.add(datos.get(i));
            i++;
            k++;
        }

        while (j < datos.subList(inicioBloque2, finBloque2).size()) {
            bloqueMezclado.add(datos.get(j));
            j++;
            k++;
        }

        for (int l = 0; l < k; l++) {
            datos.set(inicioBloque1 + l, bloqueMezclado.get(l));
        }
    }

void escribirDatosEnArchivo(List<Integer> datos) throws IOException {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("salida.txt"))) {
        for (Integer dato : datos) {
            writer.write(dato.toString());
            writer.newLine();
        }
    }
    }

   
}