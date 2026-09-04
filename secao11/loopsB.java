package secao11;

public class loopsB {

    public static void main(String[] args) {

        // 8 - loops com rotulos

        //rotulos internos e externos


        externo:
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++){

                if (i == 1 && j==1){
                   break externo;

                }

                System.out.println("i" + i + ", J" + j);
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Externo i");

            interno:
            for (int j = 0; j < 3; j++){

                if (j==2){
                    System.out.println("Parou interno!");
                   break interno;

                }
                System.out.println("i" + i + ", J" + j);
            }
        }

        // 9 - off by one

        // executar um loop 5 vezes

        for (int i = 0; i < 5; i++){
            System.out.println("I " + i);
        }



    }
}
