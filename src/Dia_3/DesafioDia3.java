package Dia_3;

import java.util.Scanner;

public class DesafioDia3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        String numeroDigitado = sc.next();

        try {
            long numero = Long.parseLong(numeroDigitado);

            if (numeroDigitado.length() == 1) {
                System.out.println("Esse número tem " + numeroDigitado.length() + " dígito");
            } else if (numeroDigitado.length() > 1 && numeroDigitado.length() <= 4) {
                System.out.println("Esse número tem " + numeroDigitado.length() + " dígitos");
            } else {
                System.out.println("Esse número tem 5 dígitos ou mais");
            }
        } catch (NumberFormatException e) {
            System.out.println("A entrada fornecida não é um número válido.");
        }

        sc.close();
    }
}
