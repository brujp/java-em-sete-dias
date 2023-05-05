package Dia_2;

import java.util.Arrays;

public class Dia2 {

    public static void main(String[] args) {

        //Criando um Array do tipo int
        int[] valores = {10, 20, 15, 30, 40};

        //Utilizando o Arrays para imprimir minha lista valores
        System.out.println(Arrays.toString(valores));

        //Criando um segundo Array do tipo String
        String[] carros = {"Jeep", "Honda", "Fiat", "Ferrari"};

        //Imprimindo o primeiro valor do Array carros (Jeep)
        System.out.println(carros[0]);

        //Atribuindo outro valor ao primeiro index do Array carros (Jeep = Hyundai)
        carros[0] = "Hyundai";
        System.out.println(Arrays.toString(carros));

        //Utilizando o Arrays para imprimir minha lista carros
        System.out.println(Arrays.toString(carros));

        //Ordenando e imprimindo as listas
        Arrays.sort(valores);
        System.out.println(Arrays.toString(valores));

        Arrays.sort(carros);
        System.out.println(Arrays.toString(carros));

        //Imprimindo o tamanho dos Arrays
        System.out.println(valores.length);
        System.out.println(carros.length);

        //Arrays multidimensionais - Array com linhas e colunas
        String[][] carrosMultidimensional = {{"Marca", "BMW"},{"Marca", "Honda"}};
        System.out.println(Arrays.deepToString(carrosMultidimensional));

    }
}
