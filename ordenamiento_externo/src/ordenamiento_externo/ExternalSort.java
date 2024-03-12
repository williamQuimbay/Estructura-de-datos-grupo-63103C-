/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamiento_externo;

import java.io.*;

public class ExternalSort {
    
     public static void main(String[] args) throws IOException {
        crearArchivo();
        System.out.println("Archivo original:");
        leer();
        OrdenamientoExterno();
        fusion();
        System.out.println("\nArchivo ordenado:");
        leer();
    }
    static int[] N = {7,20,37,5,6,23,1,17,45,10,2}; // tamaño del archivo
    static String path = "entrada.txt";

    static void crearArchivo() throws IOException {
         try (BufferedWriter out = new BufferedWriter(new FileWriter(path)))
         {
             for (int i = 0; i < N.length; i++) {
                 out.write(Integer.toString(N[i]));
                 out.write("\n");
             }}
    }

    static void leer() throws IOException {
         try (BufferedReader in = new BufferedReader(new FileReader(path)))
         {
             String line;
             while ((line = in.readLine()) != null) {
                 System.out.println(line);
             }}
    }

    static void OrdenamientoExterno() throws IOException {
        String[] files = {"entrada.txt", "salida.txt"};
        int[] arr = new int[N.length];
         try (BufferedReader in = new BufferedReader(new FileReader(path)))
         {
             for (int i = 0; i < N.length; i++)
                 arr[i] = Integer.parseInt(in.readLine());
         }
        clasificar(arr, 0, N.length-1);

        int i = 0;
        while (i < N.length) {
            try (BufferedWriter out = new BufferedWriter(new FileWriter(files[i % 2], true)))
            {
                out.write(Integer.toString(arr[i]));
                out.write("\n");
                out.close();
                i++;
            }
        }
    }

    static void fusion() throws IOException {
        BufferedReader f2;
        PrintWriter out;
         try (BufferedReader f1 = new BufferedReader(new FileReader("entrada.txt")))
         {
             f2 = new BufferedReader(new FileReader("salida.txt"));
             out = new PrintWriter(new FileWriter(path));
             String line1 = f1.readLine(), line2 = f2.readLine();
             while (line1 != null && line2 != null) {
                 if (Integer.parseInt(line1) < Integer.parseInt(line2)) {
                     out.println(line1);
                     line1 = f1.readLine();
                 } else {
                     out.println(line2);
                     line2 = f2.readLine();
                 }
             }    while (line1 != null) {
                 out.println(line1);
                 line1 = f1.readLine();
             }    while (line2 != null) {
                 out.println(line2);
                 line2 = f2.readLine();
             }}
         f2.close();
        out.close();
    }

   

    static void unir(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void clasificar(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            clasificar(arr, l, m);
            clasificar(arr, m + 1, r);

            unir(arr, l, m, r);
        }
    }
}
