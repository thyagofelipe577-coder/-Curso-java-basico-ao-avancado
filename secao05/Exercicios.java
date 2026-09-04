package secao5;

import java.util.Scanner;


public class Exercicios {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o preço do produto: ");

        double preco = scanner.nextDouble();

        if (preco < 50.00){

            System.out.println("Categoria: Barato");

        } else if (preco >= 50.00 && preco <= 100.00) {

            System.out.println("Categoria: Medio");

        } else if (preco >= 100.00) {

            System.out.println("Categoria: Caro");

        }

        //Exercicio 2

        System.out.println("Insira o nome de usuário: ");

        String usuario = scanner.next().toLowerCase();

        System.out.println("Insira a senha: ");

        String senha = scanner.next();

        if (usuario.equals("admin") && senha.equals("1234")){

            System.out.println("Acesso permitido.");

        } else {

            System.out.println("Acesso negado");

        }

        System.out.println("Insira um numero: ");

        int numero = scanner.nextInt();

        String resultado;

        if (numero % 2 == 0){

            resultado = "par";

        } else {

            resultado = "Impar";

        }

        System.out.println("O resultado do seu numero é: " + resultado);

        System.out.println("Informe um numero de 1 a 7 (referente ao dia da semana): ");

        byte dia = scanner.nextByte();

        switch (dia){

            case 1:
            case 7:
                System.out.println("Final de semana (Não é um dia útil.)");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
               System.out.println("Dia da semana (É um dia útil.)");
               break;
            default:
                System.out.println("Numero invalido!");
                break;
        }

        System.out.println("Insira um numero: ");

        int numero1 = scanner.nextInt();

        if (numero1 >= 10 && numero1 <= 20 ){

            System.out.println("Dentro do intervalo.");

        }else {

            System.out.println("Fora do intervalo.");

        }

        // .equalsIgnoreCase ou .toLowerCase()

        System.out.println("informe uma letra do alfabeto: ");

        char letra = scanner.next().toLowerCase().charAt(0);

        switch (letra){

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vogal");
                break;
            default:
                System.out.println("consoante");
                break;

        }
        scanner.close();

    }

}
