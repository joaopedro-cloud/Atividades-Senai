package atividade17;
import java.util.Scanner;
public class exercicio_10_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura (°C): ");
        double t = sc.nextDouble();

        if (t < 0) System.out.println("Alerta: Congelamento!");
        else if (t <= 40) System.out.println("Temperatura normal.");
        else System.out.println("Alerta: Superaquecimento!");
    }
}

