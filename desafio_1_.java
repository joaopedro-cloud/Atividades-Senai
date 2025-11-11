package desafios;
import java.util.Scanner;
public class desafio_1_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos termos da sequência de Fibonacci você deseja gerar? ");
        int n = sc.nextInt();
        
        int a = 0;
        int b = 1;

        System.out.println("\nSequência Mágica de Fibonacci:");
        for (int i = 1; i <= n; i++) {
            int termo = a;

            boolean primo = true;
            if (termo < 2) {
                primo = false;
            } else {
                for (int j = 2; j <= termo / 2; j++) {
                    if (termo % j == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                System.out.print(termo + "* ");
            } else {
                System.out.print(termo + " ");
            }

            int proximo = a + b;
            a = b;
            b = proximo;
        }

        sc.close();
    }
}
