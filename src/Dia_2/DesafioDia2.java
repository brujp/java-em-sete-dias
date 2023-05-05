package Dia_2;

import java.util.Arrays;

public class DesafioDia2 {

    public static void main(String[] args) {

        //Criando um Array int
        int[] numeros = {
                1789, 2848, 8373, 5624, 4624,
                4755, 5745, 8766, 1534, 2132
        };

        //Criando um Array String
        String[] linguagens = {
                "Python", "PHP", "Node",
                "Java", "Go"
        };

        //Imprimindo o Array original, ordenando e imprimindo ordenado
        System.out.println("Array numeros original: " + Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println("Array numeros ordenado: " + Arrays.toString(numeros));

        System.out.println("Array linguagens original: " + Arrays.toString(linguagens));
        Arrays.sort(linguagens);
        System.out.println("Array linguagens ordenado: " + Arrays.toString(linguagens));

    }
}
