import java.util.Scanner;

public class InspecaoFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Percentual de defeitos (%): ");
        double defeitos = sc.nextDouble();
        if (defeitos > 20) System.out.println("Reprovar");
        else if (defeitos >= 10) System.out.println("Retrabalho");
        else System.out.println("Aprovar");
        sc.close();
    }
}