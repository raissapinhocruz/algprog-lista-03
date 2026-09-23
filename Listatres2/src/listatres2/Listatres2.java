/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listatres2;

import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Listatres2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double compra = scanner.nextDouble();

        System.out.print("Digite o valor pago: R$ ");
        double pago = scanner.nextDouble();

        if (pago < compra) {

            System.out.println("Quantia paga insuficiente para realizar a compra.");

        } else {

            int troco = (int) Math.round(pago - compra);

            System.out.println("\nTroco: R$ " + troco + ",00");

            int notas50 = troco / 50;
            troco %= 50;

            int notas20 = troco / 20;
            troco %= 20;

            int notas10 = troco / 10;
            troco %= 10;

            int notas5 = troco / 5;
            troco %= 5;

            int notas2 = troco / 2;
            troco %= 2;

            int notas1 = troco;

            System.out.println("Notas de R$ 50,00: " + notas50);
            System.out.println("Notas de R$ 20,00: " + notas20);
            System.out.println("Notas de R$ 10,00: " + notas10);
            System.out.println("Notas de R$ 5,00: " + notas5);
            System.out.println("Notas de R$ 2,00: " + notas2);
            System.out.println("Notas de R$ 1,00: " + notas1);
        }

        scanner.close();
    }
        // TODO code application logic here
    }
    

