package atividade17;
import java.util.Scanner;
public class exercicio_2_ {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("1 - Aprovado");
        System.out.println("2 - Reprovado");
        System.out.println("3 - Retrabalhado");
        System.out.println("4 - Análise manual");
        System.out.println("Digite o código da condição peça");

        int codigo = sc.nextInt();
        if (codigo == 1)
            System.out.println("Peça aprovada");
        else if (codigo == 2)
            System.out.println("Peça reprovada");
        else if (codigo == 3)
            System.out.println("Peça em retrabalho");
        else if (codigo == 4)
            System.out.println("Peça em análise manual");
        else
            System.out.println("Código inválido");

    }
}
