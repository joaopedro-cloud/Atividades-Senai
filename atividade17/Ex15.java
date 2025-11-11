import java.util.Scanner;

public class FabricaInteligente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura (°C): ");
        double temp = sc.nextDouble();
        System.out.print("Vibração (%): ");
        double vibracao = sc.nextDouble();
        if (temp > 90 || vibracao > 80)
            System.out.println("Desligar em emergência!");
        else
            System.out.println("Operação normal.");
        sc.close();
    }
}