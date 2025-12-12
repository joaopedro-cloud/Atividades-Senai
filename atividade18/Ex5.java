import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma senha: ");
        String senha = sc.nextLine();

        boolean temNumero = false, temMaiuscula = false;

        int i = 0;
        while (i < senha.length()) {
            char c = senha.charAt(i);
            if (Character.isDigit(c)) temNumero = true;
            if (Character.isUpperCase(c)) temMaiuscula = true;
            i++;
        }

        if (senha.length() >= 8 && temNumero && temMaiuscula)
            System.out.println("Senha válida!");
        else
            System.out.println("Senha inválida!");
        sc.close();
    }
}