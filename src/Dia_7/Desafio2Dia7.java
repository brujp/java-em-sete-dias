package Dia_7;

import java.util.Scanner;

public class Desafio2Dia7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroDigitado = sc.nextInt();

        if(numeroDigitado % 2 != 0) {
            System.out.println("Ímpar");
        } else if (numeroDigitado >= 2 && numeroDigitado <= 5) {
            System.out.println("A");
        } else if (numeroDigitado >= 6 && numeroDigitado <= 20) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

        sc.close();
    }
}
