package secao10;

import java.util.Scanner;

public class contadorDePalavras {

    public static void main(String[] args) {
        Scanner scannerGlobal = new Scanner(System.in);
        System.out.println("---Bem vindo ao contador de palavras---");

        novaFrase(scannerGlobal);

        scannerGlobal.close();
    }

    public static void contadorPalavras (Scanner leia){

        System.out.println("Escolha uma frase para ser contada: ");

        String frase =  leia.nextLine();

        // Transforma uma frase em um Array de Strings
        String [] palavras = frase.trim().split("\\s+");

        //vai transformar
        // Java é legal em: ['java','é','legal']

        int numeroPalavras = palavras.length;

        System.out.println("A frase contém " + numeroPalavras + " palavras");

    }

    public static void novaFrase (Scanner scanner) {
        String resposta;

        do {
            contadorPalavras(scanner);

            System.out.println("Deseja digitar uma nova frase? S/N ");
             resposta = scanner.nextLine();

            if (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
                System.out.println("Opção inválida! O programa será encerrado por segurança.");
            }

        } while (resposta.equalsIgnoreCase("S"));
        System.out.println("Programa encerrado!");

    }


}
