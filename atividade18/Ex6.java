import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas notas deseja inserir? ");
        int n = sc.nextInt();
        double soma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Nota " + i + ": ");
            soma += sc.nextDouble();
        }

        double media = soma / n;
        System.out.println("Média: " + media);

        if (media >= 7) System.out.println("Aprovado!");
        else if (media >= 5) System.out.println("Recuperação.");
        else System.out.println("Reprovado.");
        sc.close();
    }
}