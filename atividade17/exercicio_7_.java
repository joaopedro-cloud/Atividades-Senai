package atividade17;
import java.util.Scanner;
public class exercicio_7_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("peso do pacote (kg): ");
        double peso = sc.nextDouble();

        if (peso < 10) System.out.println("leve");
        else if (peso <=30) System.out.println("medio");
        else if (peso <= 60) System.out.println("pesado");
        else System.out.println("muito pesado");
        }

    }

