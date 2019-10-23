/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao;

import java.util.Arrays;

/**
 *
 * @author Arthur Ern
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vet = {6, 3, 4, 5, 2, 7, 1,9 , 8, 0};
        quickSort(vet, 0, vet.length-1);
        System.out.println(Arrays.toString(vet));
    }

    private static void quickSort(int[] vet, int esq, int dir) {
        if(esq < dir){
            int j = separar(vet, esq, dir);
            quickSort(vet, esq, j-1);
            quickSort(vet, j+1, dir);
        }
    }

    private static int separar(int[] vet, int esq, int dir) {
        int i = esq + 1;
        int j = dir;
        int pivo =  vet[esq];
        while(i <= j){
            if(vet[i] <= pivo) i++;
            else if (vet[j] > pivo) j--;
            else if (i <= j){
                trocar(vet, i, j);
                i++;
                j--;
            }
        }
        trocar(vet, esq, j);
        return 0;
    }

    private static void trocar(int[] vet, int i, int j) {
        int aux = vet[i];
        vet[i] = vet[j];
        vet[j] = aux;
    }
    
}
