package Dia_4;

public class NestedLoops {

    public static void main(String[] args) {

        //NestedLoops - Um loop dentro de outro
        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
