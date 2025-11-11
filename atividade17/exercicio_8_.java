package atividade17;
import java.util.Scanner;
public class exercicio_8_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("material restante (%): ");
        int mat = sc.nextInt();

        if (mat < 20) System.out.println("troca material");
        else System.out.println("continuar impressão");
    }
}
