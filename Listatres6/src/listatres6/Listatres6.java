/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listatres6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Listatres6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        int menor;
        int maior;

        if (numero1 < numero2) {
            menor = numero1;
            maior = numero2;
        } else {
            menor = numero2;
            maior = numero1;
        }

        // Sorteia um número entre menor e maior, inclusive
        int numeroSorteado = random.nextInt(maior - menor + 1) + menor;

        System.out.println("\nMenor número: " + menor);
        System.out.println("Maior número: " + maior);
        System.out.println("Número sorteado: " + numeroSorteado);

        if (numeroSorteado % 2 == 0) {
            System.out.println("O número sorteado é PAR.");
        } else {
            System.out.println("O número sorteado é ÍMPAR.");
        }

        scanner.close();
           
    }
    
}
