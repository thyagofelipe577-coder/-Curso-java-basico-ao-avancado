package secao8;

import javax.swing.*;
import java.util.Arrays;
import  java.util.List;

public class funcaoC {

    public static void main(String[] args) {

        //12 - função recursiva

       int somar = somaRecursiva(6);

       System.out.println(somar);

      //13 - Method overloading

        System.out.println(soma(4,4,6));
        System.out.println(soma(2.2,4.4));
        System.out.println(soma(17,14));

        //14 - função anonima

        Runnable tarefa =() -> System.out.println("Função Anonima!");

        tarefa.run();
        // (args 1, args2) -> {}

        List<String> nomes = Arrays.asList("ana","pedro","jose");

        nomes.forEach(nome -> System.out.println(nome));
    }

    public static int somaRecursiva (int n) {

        if (n == 1){
            return 1;
        } else {
            return n + somaRecursiva( n - 1);
        }
    }

    public static int soma (int a, int b) {
        return a + b;
    }
    public static int soma (int a, int b,int c) {
        return a + b + c;
    }
    public static double soma (double a,double b) {
        return a + b;
    }


}
