package proyecto1;

public class ordenamiento {

    public void ordenarMezclaDirecta(int[] arreglo) {
        int n = arreglo.length;
        int[] temp = new int[n];
        ordenarMezclaDirecta(arreglo, temp, 0, n - 1);
    }

    private void ordenarMezclaDirecta(int[] arreglo, int[] temp, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int centro = (izquierda + derecha) / 2;
            ordenarMezclaDirecta(arreglo, temp, izquierda, centro);
            ordenarMezclaDirecta(arreglo, temp, centro + 1, derecha);
            mezclar(arreglo, temp, izquierda, centro, derecha);
        }
    }

    private void mezclar(int[] arreglo, int[] temp, int izquierda, int centro, int derecha) {
        for (int i = izquierda; i <= derecha; i++) {
            temp[i] = arreglo[i];
        }
        int i = izquierda;
        int j = centro + 1;
        int k = izquierda;

        while (i <= centro && j <= derecha) {
            if (temp[i] <= temp[j]) {
                arreglo[k] = temp[i];
                i++;
            } else {
                arreglo[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= centro) {
            arreglo[k] = temp[i];
            i++;
            k++;
        }

        while (j <= derecha) {
            arreglo[k] = temp[j];
            j++;
            k++;
        }
    }
}