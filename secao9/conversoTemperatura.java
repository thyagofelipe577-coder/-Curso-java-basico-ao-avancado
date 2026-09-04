package secao9;

import java.util.HashSet;
import java.util.Scanner;

public class conversoTemperatura {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CONVERSOR DE TEMPERATURA ---");

        System.out.println("Informe a temperatura para a conversão: ");

        double temperaturaConversao = scanner.nextInt();

        System.out.println("Deseja converter em Celsius ou Fahrenheit? ");

        String temperatura = scanner.next();

        double resultado = 0.0;

        if (temperatura.equalsIgnoreCase("celsius")) {
            resultado = conversorParaCelsius(temperaturaConversao);
            System.out.println("A conversão de Fahrenheit para Celsisus é: " + resultado + "°C");

        } else if (temperatura.equalsIgnoreCase("Fahrenheit")) {
             resultado = conversorParaFahrenheit(temperaturaConversao);
            System.out.println("A conversão de Celisus para Fahrenheit é: " + resultado + "°F");

        } else {
            System.out.println("Opção invalida!");

        }


        scanner.close();
    }
    
    public static double conversorParaCelsius ( double fahrenheit) {
                return  (fahrenheit - 32)  * 5 / 9;
    }

    public static double conversorParaFahrenheit (double celsius){
            return  (celsius + 32) * 9 / 5;
    }




}
