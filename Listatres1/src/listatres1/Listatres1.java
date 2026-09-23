/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listatres1;

import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Listatres1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double n3 = scanner.nextDouble();

        double maior = n1;
        double menor = n1;

        if (n2 > maior) {
            maior = n2;
        }

        if (n3 > maior) {
            maior = n3;
        }

        if (n2 < menor) {
            menor = n2;
        }

        if (n3 < menor) {
            menor = n3;
        }

        double media = (n1 + n2 + n3) / 3;

        System.out.println("\nMaior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.printf("Média: %.2f%n", media);

        scanner.close();
        // TODO code application logic here
    }
    
}
