package atividade17;
import java.util.Scanner;
public class exercicio_6_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Distancia do obstaculo (m): ");
        double d = sc.nextDouble();

        if (d < 5) System.out.println("FREAR!");
        else if (d <= 15) System.out.println("reduzir velocidade.");
        else System.out.println("acelerar.");

        }
    }
