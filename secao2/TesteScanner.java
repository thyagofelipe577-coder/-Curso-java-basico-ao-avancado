package secao2;


import java.util.Scanner;

public class TesteScanner {
    
    public static void main(String[] args) {
        
        // 1- Testando Scanner

        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite seu nome: ");

        String nome = scanner.nextLine();     

        System.out.println("Olá " + nome + "!");
         
        System.out.println("Digite um numero: ");

        int numero = scanner.nextInt();

        System.out.println("Seu numero é: "+ numero);

        // Problema
         
        System.out.println("Digite um numero:");

        int n = scanner.nextInt();

        scanner.nextLine(); 

        System.out.println("Digite um nome: ");

        String txt = scanner.nextLine();


        System.out.println("O numero é: " + n + " e seu nome: " + txt);

        

        scanner.close();

    }
}
