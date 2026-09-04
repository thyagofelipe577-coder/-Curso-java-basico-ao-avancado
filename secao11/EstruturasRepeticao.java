package secao11;

import static java.lang.System.out;

public class EstruturasRepeticao {

    public static void main(String[] args) {

        // 1- For

        // loop que vai rodar de 1 a 5

        // Variavel de inicialização = i,j,k
        // Condição: determina até quando ou quantas vezes, o loop vai rodar
        // Incrimento: como a variavel vai chegar na condição

//        for (int i = 1; i <= 5; i++){
//            out.println("contador: " + i);
//        }
//
//        // mostrar cada caractere de  uma string
//
//        String palavra = "Java";
//
//        for (int i = 0; i < palavra.length();i++) {
//            System.out.println("caractere: "+ palavra.charAt(i));
//
//        }
        //Contagem regressiva

        for (int i = 5; i >= 1; i--) {

            System.out.println("Regresso: " + i);

        }

        // 2- while

        int j= 0;
        while( j <=5){
            System.out.println("While contador: " + j);
            j++;
        }

        int valor = 0;

        while (valor !=7){

            valor = (int)(Math.random() * 100);
            System.out.println("Valor aleatorio: "+ valor);
        }

        //3 - loopinfinito apaguei o e pra dar erro
        // while (tru){
        // System.out.println("Infinito!");
        // }

        //4- Do while
        int k = 10;

        do {
            System.out.println("O valor de K é: " + k);
            k--;
        } while (k > 0) ;

        //5- Break

        for (int x = 0; x < 10; x++){
            System.out.println("O valor de x é: " + x);

            if (x == 5) {

                System.out.println("Fim da execucação!");
                break;

            }
        }
        //6 - Continue
         for (int x= 10; x > 0; x--){

             if (x % 2 == 0) {
                 out.println("O numero: "+ x + " é par!");
                 continue;
             }
             out.println("Contador: " + x);
         }
         //7 - nested loop
        for (int m = 1; m <= 3; m++) {

            out.println("Externo!");

            for (int n = 1; n <=3; n++){

                out.println(m + " X "+ n + " = "+ (m*n));

            }
        }
        // padrão estrela

        for (int o = 1; o<=10;o++){

            for (int p= 1; p <= o; p++){

                out.print("*");
            }
            out.println();

        }
        for (int t = 10; t >= 1; t--){

            for (int h = 1; h <= t; h++){
                out.print("*");
            }
            out.println();

        }

    }

}
