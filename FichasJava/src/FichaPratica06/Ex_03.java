package FichaPratica06;

public class Ex_03 {


    /**
     * Método que avalia se um número é ou não impar
     * @param num Número a ser avaliado
     * @return True - se par || False - se impar
     */
    public static boolean par(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Método que avalia se um um número é positivo
     * @param num - Número a ser avaliado
     * @return True - se zero ou positivo || False - se negativo
     */
    public static boolean positivo(int num){
        if(num>=0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Método que avalia se um número é ou não primo
     * @param num Número a ser avaliado
     * @return True - se primo || False - se não primo
     */
    public static boolean primo(int num){

        for(int divisor=2; divisor<num; divisor++){
            if(num%divisor==0){
                return false;
            }
        }

        return true;
    }


    /**
     * Método que avalia se um número é ou não perfeito
     * @param num Número a ser avaliado
     * @return True - se perfeito || False - se não perfeito
     */
    public static boolean perfeito(int num){

        int somaDivisores=0;

        for(int divisor=1; divisor<num;divisor++){
            if(num%divisor==0){
                somaDivisores+=divisor;
            }
        }

        if(somaDivisores==num){
            return true;
        }else {
            return false;
        }
    }


    /**
     * Método que avalia se um número é ou não triangular
     * @param num Número a ser avaliado
     * @return True - se triangular || False - se não triangular
     */
    public static boolean triangular(int num){

        int somatorio=0, contador=1;

        while (somatorio<num){
            somatorio+=contador;

            contador++;

            if(somatorio==num){
                return true;
            }
        }

        return false;
    }

}
