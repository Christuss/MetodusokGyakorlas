/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodusokgyakorlas;

import java.util.Random;

/**
 *
 * @author User
 */
public class QrKod {
    static Random rnd = new Random();
    public static void main(String[] args) {
        qr(100, true);
    }

    private static void qr() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                boolean kiir = rnd.nextBoolean();
                if (kiir) {
                    System.out.print("\u001B[45m" + " ");
                } else {
                    System.out.print("\u001B[0m" + " ");
                }
            }
            System.out.println();
        }
    }
    private static void qr(int sorHossz) {
        int oszlopHossz = sorHossz / 2;
        for (int i = 0; i < oszlopHossz; i++) {
            for (int j = 0; j < sorHossz; j++) {
                boolean kiir = rnd.nextBoolean();
                if (kiir) {
                    System.out.print("\u001B[45m" + " ");
                } else {
                    System.out.print("\u001B[0m" + " ");
                }
            }
            System.out.println();
        }
    }
    private static void qr(boolean vanNegyzet) {
        if (vanNegyzet) {
            sorKiir(5);
            for (int i = 0; i < 5; i++) {
                System.out.print("\u001B[42m" + " ");
            }
            
            System.out.println();
            sorKiir(5);
            System.out.print("\u001B[42m" + " ");
            for (int i = 0; i < 3; i++) {
                System.out.print("\u001B[0m" + " ");
            }
            System.out.print("\u001B[42m" + " ");
            
            System.out.println();
            sorKiir(5);
            System.out.print("\u001B[42m" + " ");
            System.out.print("\u001B[0m" + " ");
            System.out.print("\u001B[42m" + " ");
            System.out.print("\u001B[0m" + " ");
            System.out.print("\u001B[42m" + " ");
            
            System.out.println();
            sorKiir(5);
            System.out.print("\u001B[42m" + " ");
            for (int i = 0; i < 3; i++) {
                System.out.print("\u001B[0m" + " ");
            }
            System.out.print("\u001B[42m" + " ");
            
            System.out.println();
            sorKiir(5);
            for (int i = 0; i < 5; i++) {
                System.out.print("\u001B[42m" + " ");
            }
        }
    }
    private static void qr(int sorHossz, boolean vanNegyzet) {
        int oszlopHossz = sorHossz / 2;
        if (vanNegyzet) {
            sorKiir(sorHossz - 5);
            for (int i = 0; i < 5; i++) {
                System.out.print("\u001B[42m" + " ");
            }
            
            System.out.println();
            sorKiir(sorHossz - 5);
            System.out.print("\u001B[42m" + " ");
            for (int i = 0; i < 3; i++) {
                System.out.print("\u001B[0m" + " ");
            }
            System.out.print("\u001B[42m" + " ");
            
            System.out.println();
            sorKiir(sorHossz - 5);
            System.out.print("\u001B[42m" + " ");
            System.out.print("\u001B[0m" + " ");
            System.out.print("\u001B[42m" + " ");
            System.out.print("\u001B[0m" + " ");
            System.out.print("\u001B[42m" + " ");
            
            System.out.println();
            sorKiir(sorHossz - 5);
            System.out.print("\u001B[42m" + " ");
            for (int i = 0; i < 3; i++) {
                System.out.print("\u001B[0m" + " ");
            }
            System.out.print("\u001B[42m" + " ");
            
            System.out.println();
            sorKiir(sorHossz - 5);
            for (int i = 0; i < 5; i++) {
                System.out.print("\u001B[42m" + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < oszlopHossz - 5; i++) {
            for (int j = 0; j < sorHossz; j++) {
                boolean kiir = rnd.nextBoolean();
                if (kiir) {
                    System.out.print("\u001B[45m" + " ");
                } else {
                    System.out.print("\u001B[0m" + " ");
                }
            }
            System.out.println();
        }
    }
    private static void sorKiir(int sorhossz) {
        for (int j = 0; j < sorhossz; j++) {
            boolean kiir = rnd.nextBoolean();
            if (kiir) {
                System.out.print("\u001B[45m" + " ");
            } else {
                System.out.print("\u001B[0m" + " ");
            }
        }
    }
}
