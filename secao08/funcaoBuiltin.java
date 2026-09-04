package secao8;

public class funcaoBuiltin {

    public static void main() {
        // 10 - funções built in exclusivos de Strings

        String frase = "java é muito bom.";

        //lenght - conta quantos caracteres tem na frase
        System.out.println(frase.length());

        // substring vai selecionar a palavra dependendo da sua posição
        System.out.println(frase.substring(0,4));

        // replace troca as palavras selecionadas
        System.out.println(frase.replace("java","programar"));

        // 11- funções Math

        System.out.println(Math.sqrt(26));

        System.out.println(Math.sqrt(9));

        System.out.println(Math.pow(2,3));

        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(10));

        System.out.println(Math.max(100,10));

        double raizQuadrada =Math.sqrt(99);

        System.out.println("A raiz quadrada de 99 é: " + raizQuadrada);
    }

}



