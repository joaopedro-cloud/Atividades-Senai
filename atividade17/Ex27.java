import java.util.Scanner;

public class ProducaoAutomatizadaAvancada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tipo de erro (1=crítico, 2=moderado, 3=sem erro): ");
        int erro = sc.nextInt();
        switch (erro) {
            case 1 -> System.out.println("Parar linha");
            case 2 -> System.out.println("Acionar manutenção");
            case 3 -> System.out.println("Continuar produção");
            default -> System.out.println("Entrada inválida");
        }
        sc.close();
    }
}