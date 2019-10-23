/*
 *Consiste em cada passo a partir do segundo elemento selecionar o próximo item 
 *da sequência e colocá-lo no local apropriado de acordo com o critério de 
 *ordenação.
 */
package Default;

import java.util.Arrays;

/**
 *
 * @author Jonas Hamerski
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int quantidade = 100;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * quantidade);
        }

        long tempoInicial = System.currentTimeMillis();

        insertionSort(vetor);

        long tempoFinal = System.currentTimeMillis();

        System.out.println(Arrays.toString(vetor));

        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

    }

    public static void insertionSort(int[] vetor) {
        int j;
        int aux;
        int i;

        for (j = 1; j < vetor.length; j++) {
            aux = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > aux); i--) {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = aux;
        }
    }
}
