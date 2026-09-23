/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listatres3;

import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Listatres3 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        // Verificação dos coeficientes
        if (a == 0 && b == 0 && c != 0) {

            System.out.println("Coeficientes informados incorretamente.");

        } else if (a == 0 && b != 0) {

            // Equação de primeiro grau
            double raiz = -c / b;

            System.out.println("Essa é uma equação de primeiro grau.");
            System.out.println("Raiz real: " + raiz);

        } else if (a == 0 && b == 0 && c == 0) {

            System.out.println("A equação possui infinitas soluções.");

        } else {

            // Cálculo do delta
            double delta = Math.pow(b, 2) - 4 * a * c;

            System.out.println("Delta = " + delta);

            if (delta < 0) {

                System.out.println("Esta equação não possui raízes reais.");

            } else if (delta == 0) {

                double raiz = -b / (2 * a);

                System.out.println(
                    "Esta equação possui duas raízes reais iguais."
                );

                System.out.println("Raiz: " + raiz);

            } else {

                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println(
                    "Esta equação possui duas raízes reais diferentes."
                );

                System.out.println("Raiz 1: " + raiz1);
                System.out.println("Raiz 2: " + raiz2);
            }
        }

        scanner.close();
        // TODO code application logic here
    }
    
}
