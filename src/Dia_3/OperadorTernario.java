package Dia_3;

public class OperadorTernario {

    public static void main(String[] args) {

        int max = 600;
        int min = 1;
        int range = max - min + 1;

        double ingresso = Math.random() * range;
        System.out.println(ingresso);

        //Operador ternário
        String terAcesso = ingresso >= 500 ? "VIP" : "Pista";
        System.out.println(terAcesso);

    }
}
