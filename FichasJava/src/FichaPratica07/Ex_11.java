package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_11 {

    /**
     * Método que retorna o número de linhas totais de um ficheiro
     *
     * @param caminhoFicheiro Caminho do Ficheiro
     * @return Número de Linhas Totais
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static int contarLinhasFicheiro(String caminhoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner scanner = new Scanner(ficheiro);

        int contagemLinhas = 0;

        while (scanner.hasNextLine()) {
            scanner.nextLine();
            contagemLinhas++;
        }

        return contagemLinhas;
    }

    /**
     * Método que retorna o número de colunas totais de um ficheiro
     *
     * @param caminhoFicheiro Caminho do Ficheiro
     * @return Número de Colunas Totais
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static int contarColunasFicheiro(String caminhoFicheiro, String delimitador) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner scanner = new Scanner(ficheiro);

        int contagemColunas = 0;

        String linha = scanner.nextLine();
        String[] itensLinha = linha.split(delimitador);

        contagemColunas = itensLinha.length;

        return contagemColunas;
    }


    /**
     * Método que armazena numa matriz o conteudo de um ficheiro
     *
     * @param caminhoFicheiro Caminho do Ficheiro
     * @return Matriz String[][] preenchida com o conteudo
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static String[][] lerFicheiroParaMatriz(String caminhoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner scanner = new Scanner(ficheiro);

        // Contar numero de linhas do ficheiro (excluindo o cabecalho)
        int numeroLinhas = (contarLinhasFicheiro(caminhoFicheiro)) - 1;

        // Contar número de colunas do ficheiro
        int numeroColunas = contarColunasFicheiro(caminhoFicheiro, ",");

        // Declarar uma matriz com o tamanho adequado
        String[][] matrizTotal = new String[numeroLinhas][numeroColunas];

        String linhaAtual = scanner.nextLine();
        int linhaMatriz = 0;

        while (scanner.hasNextLine()) {
            linhaAtual = scanner.nextLine();
            String[] itensLinha = linhaAtual.split(",");

            for (int i = 0; i < itensLinha.length; i++) {
                matrizTotal[linhaMatriz][i] = itensLinha[i];
            }

            linhaMatriz++;

        }

        return matrizTotal;
    }

    /**
     * Método para imprimir uma matriz na consola
     *
     * @param matriz Matriz a imprimir
     */
    public static void imprimirMatrizConsola(String[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println();
        }
    }

    /**
     * Método para imprimir na consola as músicas de um determinado genero
     *
     * @param matrizTotal Matriz a pesquisar
     * @param genero      Género a pesquisar
     */
    public static void pesquisarMusicasPorGenero(String[][] matrizTotal, String genero) {

        for (int linha = 0; linha < matrizTotal.length; linha++) {

            if (matrizTotal[linha][2].equals(genero)) {
                System.out.println("Nome Música: " + matrizTotal[linha][0] + "\t" + "Artista: " + matrizTotal[linha][1]);
            }
        }
    }

    /**
     * Método para imprimir na consola as músicas de um determinado artista
     *
     * @param matrizTotal Matriz a pesquisar
     * @param artista     Artista a pesquisar
     */
    public static void pesquisarMusicasPorArtista(String[][] matrizTotal, String artista) {
        for (int linha = 0; linha < matrizTotal.length; linha++) {

            if (matrizTotal[linha][1].equals(artista)) {
                System.out.println("Nome Música: " + matrizTotal[linha][0] + "\t" + "Género: " + matrizTotal[linha][2]);
            }
        }
    }


    /**
     * Método que imprime na consola a musica com maior duracao
     *
     * @param matrizTotal
     */
    public static void pesquisarMusicaMaiorDuracao(String[][] matrizTotal) {
        int maiorDuracao = 0, duracao;
        String linhaMusicaMaisLonga = "";

        // Iterar a matriz
        for (int linha = 0; linha < matrizTotal.length; linha++) {

            // Separar a coluna 3 com base no ":"
            String[] duracaoString = matrizTotal[linha][3].split(":");

            // Passar a duração para um inteiro (minutos multiplicam por 100) e segundos entram diretos
            duracao = (Integer.parseInt(duracaoString[0]) * 100) + Integer.parseInt(duracaoString[1]);

            // Se a minha duracaoAtual for maior que a maiorDuracao
            if (duracao > maiorDuracao) {
                // Limpa a String que contem a musica maior
                linhaMusicaMaisLonga = "";

                // Atualiza a maiorDuracao
                maiorDuracao = duracao;

                // Constroi a String da Musica com maior duracao
                for (int i = 0; i < matrizTotal[0].length; i++) {
                    linhaMusicaMaisLonga += matrizTotal[linha][i] + "\t|\t";
                }
            }
        }

        // Imprimir a musica com maior duracao
        System.out.println(linhaMusicaMaisLonga);

    }

    public static void pesquisarMusicasAcimaDeDuracao(String[][] matrizTotal, int minutos, int segundos){

        int duracaoEspecificada= (minutos*100)+segundos;

        int  duracao;

        // Iterar a matriz
        for (int linha = 0; linha < matrizTotal.length; linha++) {

            // Separar a coluna 3 com base no ":"
            String[] duracaoString = matrizTotal[linha][3].split(":");

            // Passar a duração para um inteiro (minutos multiplicam por 100) e segundos entram diretos
            duracao = (Integer.parseInt(duracaoString[0]) * 100) + Integer.parseInt(duracaoString[1]);

            if(duracao>=duracaoEspecificada){
                for (int i = 0; i < matrizTotal[0].length; i++) {
                    System.out.print(matrizTotal[linha][i] + "\t|\t");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int opcao;

        String[][] matrizTotal = lerFicheiroParaMatriz("Ficheiros/exercicio_11.csv");

        //imprimirMatrizConsola(matrizTotal);


        do {
            System.out.println("\n\n****** Programa de Analisar Músicas ******");
            System.out.println("1. Pesquisar por músicas de um determinado género");
            System.out.println("2. Pesquisar músicas de um determinado artista");
            System.out.println("3. Pesquisar música com maior duração");
            System.out.println("4. Pesquisar músicas com duração acima de um valor especificado");
            System.out.println("5. Número de músicas no ficheiro");
            System.out.println("0. Sair");

            System.out.print("\nSelecione uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Pesquisar por músicas de um determinado género
                    System.out.println("\n*** Pesquisar por músicas de um determinado género ***");
                    System.out.print("Género a pesquisar: ");
                    input.nextLine();
                    String genero = input.nextLine();

                    pesquisarMusicasPorGenero(matrizTotal, genero);
                    break;

                case 2: // Pesquisar músicas de um determinado artista
                    System.out.println("\n*** Pesquisar músicas de um determinado artista ***");
                    System.out.print("Artista a pesquisar: ");
                    input.nextLine();
                    String artista = input.nextLine();

                    pesquisarMusicasPorArtista(matrizTotal, artista);
                    break;

                case 3: // Pesquisar música com maior duração
                    System.out.println("\n*** Pesquisar música com maior duração ***");
                    pesquisarMusicaMaiorDuracao(matrizTotal);
                    break;

                case 4: // Pesquisar músicas com duração acima de um valor especificado
                    int minutos, segundos;
                    System.out.println("\n*** Pesquisar músicas com duração acima de um valor especificado ***");

                    do {
                        System.out.print("Insira os minutos: ");
                        minutos = input.nextInt();
                        System.out.print("Insira os segundos: ");
                        segundos = input.nextInt();

                    } while (segundos > 59);

                    pesquisarMusicasAcimaDeDuracao(matrizTotal,minutos,segundos);

                    break;

                case 5: // Número de músicas no ficheiro
                    System.out.println("Músicas no ficheiro: " + matrizTotal.length);
                    break;

                case 0: // Sair
                    System.out.println("Obrigado, até logo!");
                    break;

                default: // Opção inválida
                    System.out.println("Opção Inválida... Tente novamente");
                    break;

            }
        } while (opcao != 0);

    }

}
