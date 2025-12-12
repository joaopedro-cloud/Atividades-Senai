import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a conversão: 1=Real para Dólar, 2=Real para Euro");
        int opcao = sc.nextInt();
        System.out.print("Valor em reais: ");
        double valor = sc.nextDouble();

        if (opcao == 1) System.out.println("Em dólares: US$ " + (valor / 5.0));
        else if (opcao == 2) System.out.println("Em euros: € " + (valor / 5.5));
        else System.out.println("Opção inválida!");
        sc.close();
    }
}