/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listatres4;

import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Listatres4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        final double PI = 3.141592;

        System.out.print("Digite o código da operação (1, 2 ou 3): ");
        int operacao = scanner.nextInt();

        System.out.print("Digite o raio: ");
        double raio = scanner.nextDouble();

        switch (operacao) {

            case 1:
                double perimetro = 2 * PI * raio;

                System.out.printf(
                    "Perímetro do círculo: %.2f%n",
                    perimetro
                );
                break;

            case 2:
                double area = PI * Math.pow(raio, 2);

                System.out.printf(
                    "Área do círculo: %.2f%n",
                    area
                );
                break;

            case 3:
                double volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);

                System.out.printf(
                    "Volume da esfera: %.2f%n",
                    volume
                );
                break;

            default:
                System.out.println(
                    "Erro: código da operação inválido."
                );
        }

        scanner.close();
        // TODO code application logic here
    }
    
}
