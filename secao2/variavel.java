package secao2;

 public class variavel {
    
 public static void main(String[] args) {
        
         // 1- O que são variaveis? 
          String nome = "Raul";


         System.out.println(nome);

 
         // 2- Atribuição de variavel com outra

         String teste = "Teste";

         String testando = teste;

         System.out.println(testando);

         long numeroGrande = 999999999999L;

         long numeroGrande2 = numeroGrande;

         System.out.println(numeroGrande2);

         // 3- Comentarios
  
         /* Comentario linha 1
         * linha2
          linha 3
         */

           
         //4- Strings

         String firstName ="Thyago";

         String lastName = "Felipe";

         System.out.println("Thyago Felipe");

         System.out.println(firstName + " " + lastName);
          
         //5 - Char
          
          char letra = ('A') ; 

          System.out.println(letra);

          // usar String letra = "A"; é igual ao char, mas oculpa mais espaço na memoria;

          char simbolo = '$';

          System.out.println(simbolo);

          // 6- Int
         
          int n = 10;

         System.out.println(n);


         System.out.println(n + 1);

         System.out.println(n - 4);

         System.out.println(n * 4);

         System.out.println(n / 2);

         int soma = n + 12;

         System.out.println(soma);

         //7 - Long; 
   
         long populacaoMundial = 800000000000L;

         System.out.println(populacaoMundial);

         //8 - double
         double preco = 19.99;

          System.out.println(preco - 4.50);

          System.out.println(preco / 3);

          System.out.println( preco * 4);

          System.out.println(preco + 2);


          // 9 - Operadores Artimeticos p1

          /* Temos algumas formas de fazer
           *  podemos usar uma variavel e depois imprimir o valor
           *  ou podemos só fazer a conta direta
           */

           int somar2 = 24 + 5;

           System.out.println(somar2);

           System.out.println(77 - 12);

           // para obter resultado quebrado precisamos que pelo menos 1 da divisão seja double

           //10 - Operadores Artimeticos p2

           int x = 5;

           x++;
           x++;
           x++;
           x++;
           x++;

           System.out.println(x);

           int y = 5;

           y--;
           y--;
           y--;
           y--;
           
           System.out.println(y);
        
           int a = 10;

            a += 5;

           System.out.println(a);
           
           int b = 10;

            b -= 5;

           System.out.println(b);

           // 11-  type Casting


           int numero2 = 42;

           long numeroLongo = numero2 ;

           double numeroDouble = numeroLongo;

           System.out.println(numeroLongo);

           System.out.println(numeroDouble);
         
           // explicito

           double valorDouble = 9.78;

           int valorInt = (int) valorDouble;

           System.out.println(valorInt);

           // casting de Char para Int

           char letra3 = 'T';

           int codigoAscii = (int) letra3;

           System.out.println(codigoAscii);
        
          // 12 - Cosntante
          
          final int DIAS_DA_SEMANA = 7;

          System.out.println("DIAS DA SEMANA" + " " + DIAS_DA_SEMANA);

          // 13 - var 

          var z = 10;

          System.out.println(z);

          var textoTeste = "Teste";

          var doubleTeste = 19.0;

          System.out.println( textoTeste);

          System.out.println(doubleTeste);



        



 
    }
}



 

