import java.util.Scanner;

public class DataCenterIndustrial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura dos servidores (°C): ");
        double temp = sc.nextDouble();
        if (temp > 80) System.out.println("Desligar servidores");
        else if (temp >= 60) System.out.println("Ativar resfriamento extra");
        else System.out.println("Normal");
        sc.close();
    }
}