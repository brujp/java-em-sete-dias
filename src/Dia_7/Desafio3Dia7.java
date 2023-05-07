package Dia_7;

import java.util.Scanner;

public class Desafio3Dia7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, insira uma expressão no formato 'numero1 operador numero2': ");
        String userInput = scanner.nextLine();
        scanner.close();

        String[] tokens = userInput.split(" ");
        if (tokens.length != 3) {
            System.out.println("Formato de entrada inválido. Por favor, siga o formato 'numero1 operador numero2'.");
            return;
        }

        try {
            double number1 = Double.parseDouble(tokens[0]);
            double number2 = Double.parseDouble(tokens[2]);
            String operator = tokens[1];

            double result;
            switch (operator) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    if (number2 == 0) {
                        System.out.println("Erro: Divisão por zero.");
                        return;
                    }
                    result = number1 / number2;
                    break;
                default:
                    System.out.println("Operador inválido. Os operadores suportados são: +, -, * e /.");
                    return;
            }

            System.out.printf("Resultado: %.2f\n", result);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, insira números.");
        }
    }
}
