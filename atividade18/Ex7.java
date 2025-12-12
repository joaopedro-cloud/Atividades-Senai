import java.util.Scanner;

public class VerificadorPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        boolean primo = true;

        if (n <= 1) primo = false;
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) System.out.println(n + " é primo.");
        else System.out.println(n + " não é primo.");
        sc.close();
    }
}