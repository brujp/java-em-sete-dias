package Dia_4;

public class DesafioADia4 {

    public static void main(String[] args) {

        //Imprimir de 0 a 100 somente os números pares utilizando for loop
        for(int i = 0; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //Imprimir de 0 a 100 somente os números pares utilizando while loop
        int i = 0;
        while (i <= 100) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

    }
}
