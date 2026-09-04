 package secao5;


  public class OperadoresLógicos {


    public static void main(String[] args) {

        //8- And

        int idade = 18;

        boolean temCarteiraDeMotorista = true;

        // Vai resultado saria igual colocar um true == true
        System.out.println(idade >= 18 && temCarteiraDeMotorista );
        System.out.println(idade >= 18 && temCarteiraDeMotorista == true);

        boolean carteiraVencida = true;

        System.out.println(idade >= 18 && temCarteiraDeMotorista && carteiraVencida == false);

        int a =10;

        int b= 20;

        if ( a > 5 && b > 10) {

            System.out.println("Deu Certo!");

        }

        if ( a > 55 && b > 10) {

            System.out.println("Deu Certo!2");
        }
        //9- OR

        boolean estaChovendo = false;
        boolean temGuardachuva = true;

        System.out.println(estaChovendo || temGuardachuva);

        int idade1 = 16;

        boolean ehMembro = true;

        if ( idade >= 16 || ehMembro){

            System.out.println("Você é membro!");
        } else {

            System.out.println("Você não é membro!");
        }

        //10 - NOT

        boolean abrirPorta = true;

        System.out.println(!abrirPorta);

        System.out.println(estaChovendo || !temGuardachuva);

        // se eu colocar !(informação) inverte tudo

        System.out.println(!(estaChovendo || !temGuardachuva));





    }

}
