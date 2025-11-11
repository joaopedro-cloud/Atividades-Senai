package desafios;

public class desafio_7_ {
    public static void main(String[] args) {

        System.out.println("Tabuada de 1 a 10:\n");


        for (int i = 1; i <= 10; i++) {


            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j); // %4d alinha em 4 espaços
            }


            System.out.println();
        }
    }
}

