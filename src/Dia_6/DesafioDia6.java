package Dia_6;

public class DesafioDia6 {

    public static void main(String[] args) {

        Carro car = new Carro();
        car.setMarca("BMW");
        car.setModelo("X6");
        car.setAnoFabricacao(2024);
        car.setValorDoCarro(130000);

        System.out.println(car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getAnoFabricacao());
        System.out.println("Valor de venda: " + car.getValorDoCarro());

    }

}
