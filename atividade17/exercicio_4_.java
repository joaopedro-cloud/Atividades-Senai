package atividade17;
import java.util.Locale;
import java.util.Scanner;
public class exercicio_4_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cargo (operador/supervisor/engenheiro): ");
        String cargo = sc.next().toLowerCase();
        if (cargo.equals("operador")) System.out.println("acesso restrito");
        else if (cargo.equals("supervisor")) System.out.println("acesso parcial");
        else if (cargo.equals("engenheiro")) System.out.println("acesso total");
        else System.out.println("cargo invalido");
    }
}
