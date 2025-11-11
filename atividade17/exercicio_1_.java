package atividade17;
import java.util.Scanner;
public class exercicio_1_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a situação dos sensores:");
        System.out.print("frontal (1 = livre, 0 = obstaculo): ");
        int frontal = sc.nextInt();
        System.out.print("direita (1 = livre, 0 = obstaculo: ");
        int direita = sc.nextInt();
        System.out.println("esquerda (1 = livre, 0 = obstaculo): ");
        int esquerda = sc.nextInt();

        if (frontal == 1) {
            System.out.println("seguir em frente");
        } else if (direita == 1){
            System.out.println("Desviar para a direita.");
        } else if (esquerda == 1) {
            System.out.println("Desviar para a esquerda.");
        } else {
            System.out.println("Parar! Obstáculo em todas as direções.");
        }
        
    }
}
