package atividade17;
import java.util.Scanner;
public class exercicio_5_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("horas de uso: ");
        int h = sc.nextInt();

        if (h < 500) System.out.println("baixa urgencia");
        else if (h <= 1000) System.out.println("media urgencia");
        else System.out.println("alta urgencia");
    }
}
