import java.util.Scanner;

public class EnergiaRenovavel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Energia solar disponível (%): ");
        double energia = sc.nextDouble();
        if (energia > 70) System.out.println("Usar energia solar");
        else if (energia >= 30) System.out.println("Usar modo híbrido");
        else System.out.println("Usar rede elétrica");
        sc.close();
    }
}