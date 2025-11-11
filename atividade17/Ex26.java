import java.util.Scanner;

public class RoboDePintura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nível de tinta (%): ");
        double tinta = sc.nextDouble();
        if (tinta < 15) System.out.println("Parar");
        else if (tinta <= 50) System.out.println("Alerta");
        else System.out.println("Continuar");
        sc.close();
    }
}