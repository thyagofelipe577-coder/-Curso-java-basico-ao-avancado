package secao11;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class exerciciosLacos {


    public static void main(String[] args) {

       // Exercicio 1

        int somatorio = 0;

        for (int i = 1; i <=100; i++) {

            somatorio +=i;

        }

        System.out.println("Soma de um 1 a 100: " + somatorio);

        // Exercicio 2

        int numero = 1;
        while (numero <= 20){
            numero++;
            if (numero %2==0){
                System.out.println("Numero par : " + numero);
            }
        }

        // exercicio 3
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numero que sera verificado: ");

        int numeroVerificacao = scanner.nextInt();

        boolean ePrimo = true;


        for (int i = 2; i < numeroVerificacao; i++){

            if (numeroVerificacao % i == 0){
                ePrimo = false;
                break;
            }
        }
        if (ePrimo){
            System.out.println("Este numero " + numeroVerificacao + " é primo!");

        } else{
            System.out.println("Este numero " + numeroVerificacao + " não é primo!");
        }


        // Exercicio 4

        int opcao;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Dizer Olá");
            System.out.println("2 - Ver a data/hora");
            System.out.println("3 - Gerar número aleatório");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("-> Olá, tudo bem com você?");
                    break;
                case 2:
                    LocalTime agora = LocalTime.now();
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
                    System.out.println("-> O horario atual é: " + agora.format(formato));
                    break;
                case 3:
                    int sorteio = (int) (Math.random()*100) +1;
                    System.out.println("-> Seu número da sorte: " + sorteio);
                    break;
                case 0:
                    System.out.println("-> Encerrando o programa... Até mais!");
                    break;
                default:
                    System.out.println("-> Opção inválida! Tente novamente.");
            }
        }while (opcao != 0);

        int feira;
        do {
            System.out.println("====Bem Vindo ao Menu====");
            System.out.println("Opção 1: Banana.");
            System.out.println("Opção 2: Maçã.");
            System.out.println("Opção 3: Abacaxi.");
            System.out.println("Opção 4: Sair.");

            feira = scanner.nextInt();

            switch (feira) {
                case 1:
                    System.out.println("Sua banana está aqui!");
                    break;
                case 2:
                    System.out.println("Sua Maçã está aqui!");
                    break;
                case 3:
                    System.out.println("Seu Abacaxi está aqui!");
                    break;
                case 4:
                    System.out.println("-> Encerrando o programa... Até mais!");
                    break;
                default:
                    System.out.println("-> Opção inválida! Tente novamente.");

            }
        } while (feira !=4);
        scanner.close();

        int numFatorial = 5;
        int fatorial = 1;


        for (int i = 1; i <= numFatorial; i++){
            fatorial = fatorial * i;

        }
        System.out.println("O fatorial de " + numFatorial + " é: " + fatorial);

        int digitos = 1000;

        int contador = 0;
        while (digitos !=0){



            digitos = digitos / 10;

            contador++;
        }

        System.out.println("numero de digitos: " + contador);

    }

}
