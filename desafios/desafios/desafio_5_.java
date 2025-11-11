package desafios;
import java.util.Scanner;
public class desafio_5_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas da pirâmide: ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {


            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }


            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }


            System.out.println();
        }

        sc.close();
    }
}

