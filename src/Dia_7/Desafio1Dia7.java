package Dia_7;

import java.util.Scanner;

public class Desafio1Dia7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroUm = sc.nextInt();

        System.out.println("Digite outro número: ");
        int numeroDois = sc.nextInt();

        System.out.println("Digite mais um número: ");
        int numeroTres = sc.nextInt();

        System.out.println(numeroUm);
        System.out.println(numeroDois);
        System.out.println(numeroTres);

        sc.close();
    }

}
