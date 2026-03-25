package secao8;

import java.util.Scanner;
public class exercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // exercicio 1
        double celsious = 25.0;

        double fahrenheit = conversao(celsious);

        System.out.println("A temperatura em fahrenheit é: "+ fahrenheit);

        // Exercicio 2

        System.out.println("O fatorial de 10 é: " + fatorial(10));

        // exercicio 3

        System.out.println(paridade(10));

        System.out.println(paridade(9));

        // exercicio 4

//        System.out.println("Informe a nota de 1 a 10");
//
//        int nota = scanner.nextInt();
//
//        System.out.println("Sua classificação é: " + recebeNota(nota));

        // exercicio 5

        int idade = 12;


       //maioridade(12);

       maioridade(44);

       // exercicio 6

        int[] numeros = {10, 22 ,44, 5};

        System.out.println(numeroGrande(numeros));
    }


    public static double conversao (double celsious) {
        return (celsious * 9/5) + 32;
    }

    public static int fatorial (int numero){

        if (numero == 0 || numero == 1){
            return 1;

        } else {
            return numero * fatorial (numero - 1);

        }
    }

    public static String paridade (int numero) {

        if (numero % 2==0) {
            return "numero par";

        } else {
            return "numero impar";

        }
    }

    public static String recebeNota (int nota) {

        switch (nota) {

            case 1:
            case 5:
                return "letra F";
            case 6:
                return "letra D";
            case 7:
                return  "Letra C";
            case 8:
                return "Letra B";
            case 9:
            case 10:
                return "Letra A";
            default:
                return "Nota Invalida";
        }
    }

    public static void maioridade (int idade) {

        if (idade >= 18) {
            System.out.println("Acesso permitido.");

        } else {
            System.out.println("Acesso negado!");
            System.exit(0);
        }
    }

     public static int numeroGrande (int []  numeros) {

        int maior =  numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior){
                maior = numeros [i];

            }
        }

        return maior;

    }




}