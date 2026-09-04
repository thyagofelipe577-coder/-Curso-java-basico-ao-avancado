package secao5;

import javax.swing.*;

import java.util.Scanner;

public class condicionais {

    public static void main(String[] args) {
        
        //1 - o que é boolean?

        boolean isTruel = true;

        boolean isFalse = false;

        System.out.println(isTruel);

        System.out.println(isFalse);

        //2 - Operadores de comparação
        // == comparação  = atribuição

        int n = 5;

        int m = 5;

        //System.out.println(n = 12 );

        System.out.println (n == 12);

        System.out.println( n == m);

        // 3 - Comparação de Strings

        //Equals compara o conteudo das strings caractere por caractere.
        // É a maneira correta e segura de verificar duas strings de valor iguais

        String str1 = "java";

        String str2 = new String ("java");

        System.out.println(str1 == str2);

        System.out.println( str1.equals(str2));

        System.out.println(str1.equals("java"));

        // Cuidado com a escrita Java == java (false) java == java (true)

        // 4- if executa um bloco de codigos se a afirmação for verdadeira.

        int numero = 5;

        if (numero > 5);{
            System.out.println("Seu numero é maior que 5!");

        }
       // Se um a função retornar um booleano, pode se usar if

        String text = "texto";

        if (text.equals("texto")){

            System.out.println("Seu texto esta correto!");
        }


        // 5- Else

        int q = 12;

        if (q > 10){
            System.out.println("Q é maior que 10");
        } else {
            System.out.println("Coloque um numero maior que 10!");
        }




        int numero1 = 6;

        if (numero1 > 6){

            System.out.println("Aprovado!");

        }else{

            System.out.println("reprovado!");
        }

        // Todo Else precisa de um if, porém nem todo if precisa de um Else.

        //7- Elseif


        double nota = 8.5;

        if (nota == 10) {

            System.out.println("Você tirou nota maxima!");
        }

        else if(nota >= 9) {
            
            System.out.println("Você tirou uma boa nota!");
            
        } else if (nota >= 7) {

            System.out.println("Uma nota Razoável, você pode melhorar!");

        } else {

            System.out.println("Nota abaixo!");
        }

        int num = 5;

        if (num > 3 && num <5 ) {

            System.out.println("Resultado!");

        } else if (num == 5) {

            System.out.println("Bug!");

        }

        //1- vou escolher a situação que eu quero que mais ocorra

        //2-  melhorar a lógica, deixo a comparação mais especifica.

        //8- Operadores Lógicos
        /*
        && (E lógico): Retorna true se ambas as informações forem  verdadeiras;
        || (OU lógico): Retorna true se uma das informações forem verdadeiras;
        ! (Não lógico): Inverte o valor lógico; retorna true se  a condição for falsa e virse
        versa;
        Combinação:Pode combinar multiplas condições em uma unica expressão lógica.

         */

        



    }
    
}
