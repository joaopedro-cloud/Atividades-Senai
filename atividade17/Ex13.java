import java.util.Scanner;

public class LinhaDeProducao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Produção por hora: ");
        int producao = sc.nextInt();
        if (producao < 50) System.out.println("Baixo desempenho");
        else if (producao <= 100) System.out.println("Regular");
        else System.out.println("Ótimo");
        sc.close();
    }
}