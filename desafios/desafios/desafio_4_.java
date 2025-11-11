package desafios;
import java.util.Scanner;
public class desafio_4_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor para sacar: R$ ");
        int valor = sc.nextInt();

        int ced50 = valor / 50;
        valor = valor % 50;

        int ced10 = valor / 10;
        valor = valor % 10;

        int ced2 = valor / 2;
        valor = valor % 2;

        if (valor != 0) {
            System.out.println("Valor inválido! Só é possível sacar múltiplos de 2.");
        } else {
            System.out.println("Cédulas de R$50: " + ced50);
            System.out.println("Cédulas de R$10: " + ced10);
            System.out.println("Cédulas de R$2: " + ced2);
        }

        sc.close();
    }

}
