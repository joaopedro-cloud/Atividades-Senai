package atividade17;
import java.util.Scanner;
public class exercicio_11_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("niveis de bateria (%): ");
        int bateria = sc.nextInt();

        if (bateria < 20) {
            System.out.println("retorno imediato a base");
        } else if (bateria <= 60) {
            System.out.println("rota curta");
        } else {
            System.out.println("rota longa");
        }
    }
}