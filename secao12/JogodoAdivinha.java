package secao12;

import java.util.Scanner;
import  java.util.Random;

public class JogodoAdivinha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        //Obter numero aleatorio
        int numeroSecreto = random.nextInt(100) + 1;

        int palpites = 0;

        int tentativas = 0;

        System.out.println("Tente acertar o número aleatorio de 1 a 100!");

        while (palpites != numeroSecreto){

            System.out.println("Escolha um número de 1 a 100: ");

            int palpite = scanner.nextInt();

            tentativas++;

            if (palpite < numeroSecreto) {

                System.out.println("O numero é maior que o seu palpite: "+ palpite+" tente novamente!");

            } else if (palpite > numeroSecreto) {

                System.out.println("O numero é menor que o seu palpite: "+ palpite+" tente novamente!");

            } else {
                System.out.println("Parabéns, você ganhou! O número secreto " + numeroSecreto + " foi encontrado com "
                        + tentativas +" tentativas!");
            }
        }


        // Fim do Scanner
        scanner.close();
    }

}


