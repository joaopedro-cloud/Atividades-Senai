import java.util.Scanner;

public class CalculadoraJurosCompostos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Capital inicial: ");
        double capital = sc.nextDouble();
        System.out.print("Taxa de juros (% ao mês): ");
        double taxa = sc.nextDouble() / 100;
        System.out.print("Meses: ");
        int meses = sc.nextInt();

        if (capital <= 0 || taxa < 0 || meses <= 0) {
            System.out.println("Valores inválidos!");
        } else {
            int i = 0;
            while (i < meses) {
                capital += capital * taxa;
                i++;
            }
            System.out.println("Valor final: R$ " + capital);
        }
        sc.close();
    }
}