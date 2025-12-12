import java.util.Scanner;

public class CalculadoraFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        long fatorial = 1;
        int i = 1;
        while (i <= n) {
            fatorial *= i;
            i++;
        }
        System.out.println("Fatorial de " + n + " = " + fatorial);
        sc.close();
    }
}