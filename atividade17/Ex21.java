import java.util.Scanner;

public class VeiculosIndustriais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Carga (kg): ");
        double carga = sc.nextDouble();
        if (carga < 500) System.out.println("Permitido");
        else if (carga <= 1000) System.out.println("Alerta");
        else System.out.println("Proibido");
        sc.close();
    }
}