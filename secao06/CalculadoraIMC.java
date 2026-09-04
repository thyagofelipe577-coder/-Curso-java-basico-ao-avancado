package secao6;

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu peso atual em KG: ");

         double peso = scanner.nextDouble();

        System.out.println("Informe sua altura atual em Metros: ");

        double altura = scanner.nextDouble();

        double calculoIMC = (peso / (altura * altura ));

        if (calculoIMC < 18.5) {

            System.out.println("Abaixo do peso.");
        } else if (calculoIMC >= 18.5 && calculoIMC<= 24.9) {
            System.out.println("Peso normal");
        } else if (calculoIMC >= 25 && calculoIMC < 29.9) {
            System.out.println("Sobrepeso");
        }else {
            System.out.println("Obesidade!");
        }


        scanner.close();
    }
}
