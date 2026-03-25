package secao7;

import java.util.Scanner;

public class ClassifacaoProduto {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String produto = "teclado";
        String produto2 = "mouse";
        String produto3 = "monitor";

        double preco = 0 ;

        System.out.println("Bem vindo! Qual o produto desejado?");

        String nomeProduto= scanner.next();

        if (produto.equalsIgnoreCase(nomeProduto) ||
                produto2.equalsIgnoreCase(nomeProduto) ||
                produto3.equalsIgnoreCase(nomeProduto)){

            System.out.println("produto catalogado. Quer alterar o preço? (sim/não)");

            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("Sim")) {

                System.out.println("Insira o novo preço: ");
                preco = scanner.nextDouble();

                if (preco < 50){

                    System.out.println("Classificação: Barato.");
                }else if (preco >= 50 && preco <= 100){
                    System.out.println("Classificação: Moderado.");
                }else {
                    System.out.println("Classificação: Caro.");

                }

                System.out.println("O preço atual do produto: " + nomeProduto + " é: " + preco);


            }  else {

                System.out.println("preço não atualizado.");
                scanner.close();
                 return;
            }
        } else {
            System.out.println("Produto inexistente.");
        }

        scanner.close();
    }
}
