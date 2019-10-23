/*
 *consiste em selecionar o menor item e colocar na primeira posição, selecionar
 *o segundo menor item e colocar na segunda posição, segue estes passos até que 
 *reste um único elemento.
 */
package ordenacao;

/**
 *
 * @author Arthur Ern
 */
public class SelectionSort {

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

        selectionSort(vetor);

        long tempoFinal = System.currentTimeMillis();

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + "-");
        }

        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

    }

    public static void selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int menor = i;
            for(int j = i + 1; j < vetor.length; j++){
                if(vetor[j] < vetor[menor]){
                    menor = j;
                }
            }
            trocar(vetor, i, menor);
        }
    }

    private static void trocar(int[] vetor, int i, int menor) {
        int aux = vetor[i];
        vetor[i] = vetor[menor];
        vetor[menor] = aux;
    }
}


