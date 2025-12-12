import java.util.Scanner;

public class ContadorPalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        sc.nextLine(); // limpar buffer
        String frase = sc.nextLine();
        String[] palavras = frase.split(" ");
        int contador = 0;
        for (String palavra : palavras) {
            if (!palavra.isEmpty()) contador++;
        }
        System.out.println("Quantidade de palavras: " + contador);
        sc.close();
    }
}