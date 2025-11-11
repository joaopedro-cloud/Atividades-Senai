package desafios;
import java.util.Scanner;
public class desafio_2_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro entre 1 e 399: ");
        int numero = sc.nextInt();

        if (numero < 1 || numero > 399) {
            System.out.println("Número fora do limite! Informe um valor entre 1 e 399.");
        } else {
            System.out.print("Número romano: ");


            while (numero >= 100) {
                System.out.print("C");
                numero -= 100;
            }

            if (numero >= 90) {
                System.out.print("XC");
                numero -= 90;
            } else if (numero >= 50) {
                System.out.print("L");
                numero -= 50;
            } else if (numero >= 40) {
                System.out.print("XL");
                numero -= 40;
            }

            while (numero >= 10) {
                System.out.print("X");
                numero -= 10;
            }

            if (numero == 9) {
                System.out.print("IX");
                numero -= 9;
            } else if (numero >= 5) {
                System.out.print("V");
                numero -= 5;
            } else if (numero == 4) {
                System.out.print("IV");
                numero -= 4;
            }

            while (numero >= 1) {
                System.out.print("I");
                numero -= 1;
            }

            System.out.println();
        }

        sc.close();
    }
}
