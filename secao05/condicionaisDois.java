package secao5;

public class condicionaisDois {

    public static void main(String[] args) {

        //1 Condicional Ternaria

        int numero = 10;

        String resultado = (numero % 2 == 0) ? "par" : "impar" ;

        System.out.println("O resultado é: " + resultado);


        //2 if encadeado

        int idade = 25;

        boolean temCarteira = true;

        if (idade >= 18) {

            if (temCarteira){

                System.out.println("Pode dirgir!");
            } else {

                System.out.println("Precisa ter carteira para dirgir!");
            }
        } else {

            System.out.println("Você não pode dirigir ainda!");

        }

        boolean a = true;
        boolean b = false;
        boolean c = true;

        // TRUE AND FALSE -> FALSE OR TRUE -> TRUE
        boolean resultado2 = a && b || c ;

        System.out.println(resultado2);

        // TRUE OR FALSE -> TRUE AND TRUE -> TRUE
        boolean resultado3 = c || b && a;

        System.out.println(resultado3);

        // NOT (TRUE OR FALSE) -> NOT (TRUE) -> FALSE AND TRUE -> FALSE
        boolean resultado4 = !(c || b) && a;

        System.out.println(resultado4);

        boolean resultado5 = (!a || b)&& c;

        //  (NOT TRUE OR FALSE -> FALSE AND TRUE -> FALSE
        System.out.println(resultado5);





    }
}
