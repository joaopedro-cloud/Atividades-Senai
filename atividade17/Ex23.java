import java.util.Scanner;

public class SegurancaDeRede {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tráfego suspeito (%): ");
        double trafego = sc.nextDouble();
        if (trafego > 70) System.out.println("Bloquear acesso");
        else if (trafego >= 30) System.out.println("Alerta");
        else System.out.println("Normal");
        sc.close();
    }
}