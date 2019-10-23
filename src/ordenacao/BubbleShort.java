/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Default;

/**
 *
 * @author Arthur Ern
 */
public class BubbleShort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {4, 2, 6, 7, 1, 9};
        int aux;

        //Metodo BubbleShort
        for (int i = 0; i < vet.length; i++) {

            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }

        }

        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }

    }
}
