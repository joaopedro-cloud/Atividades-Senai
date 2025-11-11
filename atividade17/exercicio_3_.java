package atividade17;
import java.util.Scanner;
public class exercicio_3_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("energia (%): ");
        int energia = sc.nextInt();
        if (energia < 30) System.out.println("modo economico");
        else if (energia <= 70) System.out.println("modo normal");
        else System.out.println("modo turbo");
    }
}
