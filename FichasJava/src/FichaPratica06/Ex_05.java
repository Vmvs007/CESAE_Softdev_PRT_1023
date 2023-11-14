package FichaPratica06;

public class Ex_05 {

    /**
     * Método que retorna o maior elemento do array
     * @param vetor Array a ser analisado
     * @return Maior elemento
     */
    public static int maiorElementoArray(int[] vetor) {

        int maiorElemento = vetor[0];

        // Ciclo que vai iterar o vetor para encontrar o maior elemento
        for (int indice = 0; indice < vetor.length; indice++) {
            // Se o vetor na posição atual for maior que "maiorElemento"
            if (vetor[indice] > maiorElemento) {
                maiorElemento = vetor[indice];
            }
        }

        return maiorElemento;
    }

    /**
     * Método que retorna o menor elemento do array
     *
     * @param vetor Array a ser analisado
     * @return Menor elemento
     */
    public static int menorElementoArray(int[] vetor) {

        int menorElemento = vetor[0];

        for (int indice = 0; indice < vetor.length; indice++) {
            if (vetor[indice] < menorElemento) {
                menorElemento = vetor[indice];
            }
        }

        return menorElemento;
    }


    /**
     * Método que avalia se um array é ou não crescente
     * @param vetor Array a ser analisado
     * @return True - se crescente || False - se não crescente
     */
    public static boolean arrayCrescente(int[] vetor) {

        for (int indice = 1; indice < vetor.length; indice++) {
            if (vetor[indice] <= vetor[indice - 1]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Método que imprime um array na consola
     * @param vetor Array a ser impresso
     */
    public static void imprimirArray(int[] vetor){
        for (int indice = 1; indice < vetor.length; indice++) {
            System.out.println("Array["+indice+"]: "+vetor[indice]);
        }
    }
}
