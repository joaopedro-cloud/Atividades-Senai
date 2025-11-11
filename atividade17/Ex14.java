import java.util.Scanner;

public class EsteiraInteligente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Itens detectados: ");
        int itens = sc.nextInt();
        if (itens < 50) System.out.println("Velocidade: Lenta");
        else if (itens <= 100) System.out.println("Velocidade: Média");
        else System.out.println("Velocidade: Rápida");
        sc.close();
    }
}