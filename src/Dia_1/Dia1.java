package Dia_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Dia1 {

    public static void main(String[] args) {

        //Abrindo o Scanner
        Scanner sc = new Scanner(System.in);

        //Solicitando o primeiro número e armazenando na variável
        System.out.println("Digite um número: ");
        double numeroUm = sc.nextDouble();

        //Solicitando o segundo número e armazenando na variável
        System.out.println("Digite outro número: ");
        double numeroDois = sc.nextDouble();

        //Criando uma variável para armazenar o resultado da soma entre os dois números
        double soma = numeroUm + numeroDois;

        //Utilizando o DecimalFormat para formatar o double com uma casa decimal
        DecimalFormat df = new DecimalFormat("#,###.0");

        //Imprimindo o resultado formatado com uma casa decimal
        System.out.print("A soma de " + numeroUm + " + " + numeroDois + " é: " + df.format(soma));

        //Fechando o Scanner
        sc.close();
    }
}
