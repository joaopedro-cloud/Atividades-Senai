package atividade17;
import java.util.Scanner;
public class exercicio_12_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("cracha valido? (1=sim, 0=não): ");
        int cracha = sc.nextInt();
        System.out.print("usa capacete? (1=sim, 0=não: ");
        int capacete = sc.nextInt();
        System.out.print("Está dentro do horário do turno? (1=sim, 0=não): ");
        int turno = sc.nextInt();

        if (cracha == 1 && capacete == 1 && turno == 1) {
            System.out.println("acesso permitido");
        } else {
            System.out.println("acesso negado");

        }
    }
}
