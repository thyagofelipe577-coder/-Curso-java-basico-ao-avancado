package secao5;

public class Switch {

    public static void main (String[] args){

        //11- Switch case e break

        /* Validar dia da semana
         *exemplo:
         *1= Domingo
         * 7= Sabado
         */

          int diasDaSemana = 2;

          switch (diasDaSemana) {

              case 1:

                  System.out.println("Domingo");
                  break;

              case 2:

                  System.out.println("Segunda-Feira");
                  break;

              case 3:

                  System.out.println("Terça- feira");
                  break;

              case 4:
                  System.out.println("Quarta-Feira");
                  break;
         }

         //12- default

        //default é o else do Switch

        int n = 10;

        switch (n) {
            case 1:
                System.out.println("é 1");
                break;

            case 2:

            System.out.println("É 2");
        
            default:

            System.out.println("Numero não encontrado.");
                break;
        }





    }
}
