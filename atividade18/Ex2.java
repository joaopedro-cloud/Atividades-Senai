import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a conversão: 1=Celsius para Fahrenheit, 2=Fahrenheit para Celsius");
        int opcao = sc.nextInt();
        System.out.print("Digite a temperatura: ");
        double temp = sc.nextDouble();

        if (opcao == 1) System.out.println("Resultado: " + ((temp * 9/5) + 32) + " °F");
        else if (opcao == 2) System.out.println("Resultado: " + ((temp - 32) * 5/9) + " °C");
        else System.out.println("Opção inválida!");
        sc.close();
    }
}