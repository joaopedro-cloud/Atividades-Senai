import java.util.Scanner;

public class InspecaoAutomatizada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tipo de defeito (1=visível, 2=microscópico, 3=ausente): ");
        int tipo = sc.nextInt();
        switch (tipo) {
            case 1 -> System.out.println("Nível alto");
            case 2 -> System.out.println("Nível médio");
            case 3 -> System.out.println("Nível baixo");
            default -> System.out.println("Tipo inválido");
        }
        sc.close();
    }
}