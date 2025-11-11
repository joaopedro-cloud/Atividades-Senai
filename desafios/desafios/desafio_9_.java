package desafios;
import java.util.Scanner;
public class desafio_9_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        int divisor = 2;

        while (n > 1) {
            int contador = 0;


            while (n % divisor == 0) {
                n /= divisor;
                contador++;
            }


            if (contador > 0) {
                System.out.println(divisor + "^" + contador);
            }

            divisor++;
        }

        sc.close();
    }
}

