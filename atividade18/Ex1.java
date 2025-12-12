import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a operação: 1=Soma, 2=Subtração, 3=Multiplicação, 4=Divisão");
        int opcao = sc.nextInt();

        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();

        if (opcao == 1) System.out.println("Resultado: " + (a + b));
        else if (opcao == 2) System.out.println("Resultado: " + (a - b));
        else if (opcao == 3) System.out.println("Resultado: " + (a * b));
        else if (opcao == 4) {
            if (b == 0) System.out.println("Erro: divisão por zero!");
            else System.out.println("Resultado: " + (a / b));
        } else System.out.println("Opção inválida!");

        sc.close();
    }
}