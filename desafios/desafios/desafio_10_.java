package desafios;
import java.util.Scanner;
public class desafio_10_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        int n = numero;
        int divisor = 2;

        System.out.println("Fatores primos de " + numero + ":");

        while (n > 1) {
            int contador = 0;


            while (n % divisor == 0) {
                n /= divisor;   // divide o número
                contador++;     // conta quantas vezes dividiu
            }

            if (contador > 0) {
                System.out.println(divisor + "^" + contador);
            }

            divisor++;

            if (divisor * divisor > n && n > 1) {
                System.out.println(n + "^1");
                break;
            }
        }

        sc.close();
    }
    }

