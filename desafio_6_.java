package desafios;
import java.util.Scanner;
public class desafio_6_ {
    public static void main(String[] args) {
        System.out.println("Tabuada de 1 a 10:\n");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j); // formatação para alinhar
            }
            System.out.println();
        }
    }
}