package atividade17;
import java.util.Scanner;
public class exercicio_9_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("indice de defeitos (%): ");
        double defeitos = sc.nextDouble();

        if (defeitos > 10) System.out.println("alerta!! indice alto de defeito!");
        else System.out.println("lote aprovado");
    }
}
