/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listatres5;

import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Listatres5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, / ou ^): ");
        char operador = scanner.next().charAt(0);

        double resultado;

        switch (operador) {

            case '+' -> {
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
            }

            case '-' -> {
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
            }

            case '*' -> {
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
            }

            case '/' -> {
                if (numero2 == 0) {
                    System.out.println(
                            "Erro: não é possível dividir por zero."
                    );
                } else {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                }
            }

            case '^' -> {
                resultado = Math.pow(numero1, numero2);
                System.out.println("Resultado: " + resultado);
            }

            default -> System.out.println(
                    "Erro: símbolo da operação inválido."
                );
        }

        scanner.close();
        // TODO code application logic here
    }
    
}
