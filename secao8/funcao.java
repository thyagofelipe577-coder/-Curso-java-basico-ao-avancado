package secao8;

public class funcao {

    public static void main(String[] args) {

        //1 - criando primeira função

        saudacao();

        // 2 - parâmetro

        soma(2,4);
        soma(4,6);

        saudar("Thyago");

        //3 - return

       int fimError = dobrar(4);

       System.out.println(fimError);

        int numero = 10;

        int numeroDobrado = dobrar(numero);

        System.out.println("Numero dobrado é: " + numeroDobrado);

        System.out.println(dobrar(12));

        //4 - retorn de variavel

        String r1 = verificarPar(numero);

        String r2 = verificarPar(numeroDobrado);

        System.out.println(r1);

        System.out.println(r2);

        int x = dobrar(somar(4,6));

        System.out.println(x);

    }
    // NIVEL DE ACESSO (PUBLIC), STATIC->Não precisa instanciar a classe pra executar,Void->tipo return
    //NOME(DA FUNÇÃO), OS PARENTES(ARGS (ARGUMENTOS), BLOCO{}
   public static void saudacao() {
        System.out.println("Olá, está é minha primeira função.");
   }

   public  static void soma (int a, int b) {
        int resultado = (a + b);
        System.out.println("O resultado da some é : " +resultado);
   }

   public static void saudar (String nome) {
        System.out.println("Olá," + nome +", tudo bem?");
   }

   //Parametros de funções diferentes, podem ter o mesmo nome
   public  static int dobrar (int n) {
           return  n * 2;
   }

   public static String verificarPar (int n) {

        String resultado = (n % 2 == 0) ? "par" : "impar";
        return "O numero " + n + "é" + resultado + ".";

        }

        public static int somar (int a, int b) {
        return a + b;

        }
   }




