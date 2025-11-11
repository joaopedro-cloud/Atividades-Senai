import java.util.Scanner;

public class TransporteAutonomo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Estrada bloqueada? (true/false): ");
        boolean bloqueada = sc.nextBoolean();
        System.out.print("Trânsito alto? (true/false): ");
        boolean transito = sc.nextBoolean();

        if (bloqueada) System.out.println("Recalcular rota");
        else if (transito) System.out.println("Usar rota alternativa");
        else System.out.println("Seguir normal");
        sc.close();
    }
}