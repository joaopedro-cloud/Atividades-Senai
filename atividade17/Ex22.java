import java.util.Scanner;

public class QualidadeDoAr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Índice de partículas: ");
        int indice = sc.nextInt();
        if (indice < 50) System.out.println("Bom");
        else if (indice <= 100) System.out.println("Moderado");
        else if (indice <= 200) System.out.println("Ruim");
        else System.out.println("Crítico");
        sc.close();
    }
}