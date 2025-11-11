import java.util.Scanner;

public class EstoqueInteligente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de produto: ");
        int qtd = sc.nextInt();
        if (qtd < 10) System.out.println("Reabastecer urgente");
        else if (qtd <= 30) System.out.println("Alerta");
        else System.out.println("Estoque normal");
        sc.close();
    }
}