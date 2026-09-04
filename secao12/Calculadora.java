package secao12;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


       // Usuario informa o numero
        System.out.println("Informe o primeiro numero: ");
        double firstNum = scanner.nextDouble();

        System.out.println("Informe o segundo numero: ");
        double secNum = scanner.nextDouble();

        // Usuario escolhe a operção
        System.out.println("Escolha a sua operação: ");
        System.out.println("Opção 1: + Adição ");
        System.out.println("Opção 2: - Subtração ");
        System.out.println("Opção 3: * Multiplicação +");
        System.out.println("Opção 4: / Divisão +");

        int operação = scanner.nextInt();

        //
        double resultado = 0;

        //realizando calculo
        switch (operação){
            case 1:
                resultado = adicionar(firstNum,secNum);
                break;

            case 2:
                    resultado = subtrair(firstNum,secNum);
                    break;

            case 3:
                resultado = multiplicar(firstNum,secNum);
                break;



            case 4:

                if (secNum !=0) {

                    resultado = dividir(firstNum,secNum);

                } else {
                    System.out.println("Divisão por 0 não permitida!");
                    scanner.close();
                    return;
                }
                break;

            default:
                System.out.println("Operação ou invalida!");
                scanner.close();
                return;

        }
        System.out.println("O resultado da operação é :" + resultado);



        // fechando scanner
        scanner.close();

    }

    // funções das operações
    public static double adicionar (double a, double b) {
        return a + b;

    }
    public static double subtrair (double a, double b) {
        return a - b;

    }
    public static double multiplicar (double a, double b) {
        return a * b;

    }
    public static double dividir (double a, double b) {
        return a / b;

    }

    
}
