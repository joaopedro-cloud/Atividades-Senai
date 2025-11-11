package desafios;
import java.util.Scanner;
public class desafio_8_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        int decimal = sc.nextInt();
        String binario = "";

        int temp = decimal;
        while (temp > 0) {
            binario = (temp % 2) + binario;
            temp /= 2;
        }

        System.out.println("Binário: " + binario);

        System.out.print("Digite um número binário: ");
        String bin = sc.next();
        int dec = 0;

        for (int i = 0; i < bin.length(); i++) {
            char c = bin.charAt(bin.length() - 1 - i);
            if (c == '1') {
                dec += Math.pow(2, i);
            }
        }

        System.out.println("Decimal: " + dec);
        sc.close();
    }
}
