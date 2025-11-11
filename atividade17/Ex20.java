import java.util.Scanner;

public class Fabrica4Turnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hora atual (0–23): ");
        int hora = sc.nextInt();
        if (hora < 12) System.out.println("Turno: Manhã");
        else if (hora <= 18) System.out.println("Turno: Tarde");
        else System.out.println("Turno: Noite");
        sc.close();
    }
}