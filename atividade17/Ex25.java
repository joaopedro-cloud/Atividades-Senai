import java.util.Scanner;

public class SistemaDeSoldagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intensidade elétrica (A): ");
        int amp = sc.nextInt();
        if (amp < 100) System.out.println("Fraca");
        else if (amp <= 200) System.out.println("Média");
        else System.out.println("Forte");
        sc.close();
    }
}