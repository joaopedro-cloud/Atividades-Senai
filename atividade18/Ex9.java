import java.util.Scanner;

public class ClassificadorIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if (idade < 13) System.out.println("Infantil");
        else if (idade < 18) System.out.println("Adolescente");
        else if (idade < 60) System.out.println("Adulto");
        else System.out.println("Idoso");
        sc.close();
    }
}