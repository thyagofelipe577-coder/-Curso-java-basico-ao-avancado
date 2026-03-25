package secao8;

public class funcaoC {



    public static void main(String[] args) {

        //12 - função recursiva

       int soma = somaRecursiva(6);

       System.out.println(soma);

    }

    public static int somaRecursiva (int n) {

        if (n == 1){
            return 1;

        } else {
            return n + somaRecursiva( n - 1);

        }

    }


}
