package Dia_5;

// Métodos estáticos basicamente eu não preciso instânciar esse cara, pois tenho acesso direto
// a ele através da classe (Classe.metodo)
//Método não estático eu preciso criar uma instância (objeto) para utilizá-lo

public class Metodos {

    public static void main(String[] args) {

        Produtos obj = new Produtos();
        obj.listaDeProdutos("TV", 100.00);
    }

}

class Produtos {

    public void listaDeProdutos(String nomeProduto, double valorProduto) {
        System.out.println(nomeProduto);
        System.out.println(valorProduto);
    }

}
