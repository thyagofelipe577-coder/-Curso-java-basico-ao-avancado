package secao8;

public class funcao2 {

    // escopo global
    static int globalvar = 20;


    public static void main(String[] args) {
        // 5-  funções de condicionais

        String r1 = verificarAcesso(19,false,false);

        System.out.println(r1);

        //6 - funções com switch

        System.out.println(diaDaSemana(6));

        //7 - System.exit

        verificarAutentificacao("admin", "senha segura");

        System.out.println("oi!");

        //8- documentação

        System.out.println("A média é:"+ calcularMedia(5,6,7));

        //9- escopo

        //escopo local
        int localvar = 10;

        if (true){
            System.out.println(localvar);
        }
        System.out.println(globalvar);

        escopoGlobal(localvar);
    }
    public static String verificarAcesso (int idade,
                                          boolean temCarteira,
                                          boolean temHistoricoNegativo) {

      if (idade  >= 18 && temCarteira && !temHistoricoNegativo) {
          return "Acesso permitido: todos os requisitos foram cumpridos.";

      } else if (idade >= 18 && temCarteira && temHistoricoNegativo) {

          return "Acesso negado: Historico negativo detectidado.";

      } else if (idade >= 18 && !temCarteira && !temHistoricoNegativo) {

          return "Acesso negado: Individuo, não possui carteira.";

      } else {
          return "Acesso negado: Requisitos não atendidos. ";
      }

    }

     public  static  String diaDaSemana (int dia) {

        switch (dia) {

            case 1:
                return "Segunda - feira";
            case 2:
                return "Terça - feira";
            case 3:
                return "Quarta - feira";
            case 4:
                return "Quinta - feira";
            case 5:
                return "Sexta - feira";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "dia invalido!";

        }
     }

    public static void verificarAutentificacao (String usuario, String senha) {

        if (!usuario.equals ("admin") || !senha.equals ("senha segura")) {

            System.out.println("Autentificação falhou!");
            System.exit(1);
        } else {
            System.out.println("Autentificação sucedida!");

        }
    }

    /**
     *
     *  Calcula a média de 3 numeros inteiros
     *
     * @param num1 -> primeira nota/número a ser enviado
     * @param num2 -> segunda nota/número a ser enviado
     * @param num3 -> terceira nota/número a ser enviado
     * @return retorna a média dos 3 numeros
     */

    public static double calcularMedia (int num1, int num2, int num3) {

        return (num1 + num2 +num3)/3;

    }

    public static void escopoGlobal (int localvar){

        System.out.println(globalvar);

        System.out.println(localvar);
    }
}

