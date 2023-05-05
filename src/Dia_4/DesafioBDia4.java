package Dia_4;

import java.util.Scanner;

public class DesafioBDia4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva uma palavra ou frase: ");
        String palavra = sc.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
                char c = palavra.charAt(i);
                System.out.print(c + " ");
        }

        sc.close();
    }
}
