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


}
