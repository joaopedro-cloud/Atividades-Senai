import java.util.Scanner;

public class ProducaoComRobos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Robô A falhou? (true/false): ");
        boolean falhaA = sc.nextBoolean();
        System.out.print("Robô B falhou? (true/false): ");
        boolean falhaB = sc.nextBoolean();

        if (falhaA && falhaB)
            System.out.println("Parar linha!");
        else if (falhaA)
            System.out.println("Acionar robô B");
        else
            System.out.println("Operação normal");
        sc.close();
    }
}