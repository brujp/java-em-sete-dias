package Dia_4;

import java.util.Scanner;

public class DesafioBDia4 {

    public static void main(String[] args) {

        //Pegar uma palavra ou frase e separar cada caracter com um espaço

        //Instânciando o Scanner
        Scanner sc = new Scanner(System.in);

        //Solicitando a palavra
        System.out.println("Escreva uma palavra ou frase: ");
        String palavra = sc.nextLine();

        //Percorrendo a palavra caracter por caracter e imprimindo
        for (int i = 0; i < palavra.length(); i++) {
                char c = palavra.charAt(i);
                System.out.print(c + " ");
        }

        //Fechando o Scanner
        sc.close();
    }
}
