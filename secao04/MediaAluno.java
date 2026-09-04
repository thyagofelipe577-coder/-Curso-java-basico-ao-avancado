package secao4;

import  java.util.Scanner;

public class MediaAluno {
    
public static void main(String[] args) {
     
    Scanner scanner = new Scanner ( System.in);

    System.out.println("Informe seu nome: ");

    String nome = scanner.nextLine();

    System.out.println("Informe sua primeira nota: ");

    int nota1 = scanner.nextInt();

    System.out.println("Informe sua segunda nota: ");

    int nota2 = scanner.nextInt();

    System.out.println("Informe sua terceira nota: ");

    int nota3 = scanner.nextInt();

    System.out.println("Informe sua quarta nota: ");

    int nota4 = scanner.nextInt();

    int Media = (nota1 + nota2 + nota3 + nota4 )/4;

    System.out.println("A média do Aluno: "+ nome + " é: "+ Media);

if (Media >= 7.0) {

    System.out.println("Aluno aprovado!");
    
} else {
    
    System.out.println("Aluno reprovado!");
}
     

    scanner.close();
    

}

}
