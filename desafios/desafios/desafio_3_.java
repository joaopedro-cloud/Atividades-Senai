package desafios;
import java.util.Scanner;
public class desafio_3_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Parte 1: Número ---
        System.out.print("Digite um número inteiro (até 7 dígitos): ");
        int numero = sc.nextInt();

        int original = numero;
        int invertido = 0;

        while (numero > 0) {
            int resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
        }

        if (original == invertido) {
            System.out.println("O número " + original + " é um palíndromo.");
        } else {
            System.out.println("O número " + original + " não é um palíndromo.");
        }

        // --- Parte 2: Palavra ---
        sc.nextLine(); // limpar o buffer
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        boolean ehPalindromo = true;
        int tamanho = palavra.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - 1 - i)) {
                ehPalindromo = false;
                break;
            }
        }

        if (ehPalindromo) {
            System.out.println("A palavra \"" + palavra + "\" é um palíndromo.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não é um palíndromo.");
        }

        sc.close();
    }
}