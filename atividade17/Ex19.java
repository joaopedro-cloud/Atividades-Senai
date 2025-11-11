import java.util.Scanner;

public class IndustriaQuimica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor do pH: ");
        double ph = sc.nextDouble();
        if (ph < 7) System.out.println("Ácido");
        else if (ph == 7) System.out.println("Neutro");
        else System.out.println("Básico");
        sc.close();
    }
}