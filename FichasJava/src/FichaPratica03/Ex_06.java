package FichaPratica03;

public class Ex_06 {
    public static void main(String[] args) {

        // Declarar variáveis
        int contador=1, somatorio=0;

        while (contador<=100){
            System.out.println(contador);

            somatorio=somatorio+contador;

            contador++;
        }

        System.out.println("Somatório: "+somatorio);

    }
}
