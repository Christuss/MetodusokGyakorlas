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
public class Equalizer {
    public static void main(String[] args) {
        ciklus();
    }

    private static void ciklus() {
        for (int i = 0; i < 5; i++) {
            eq();
        }
    }
    public static void eq() {
        Random rnd = new Random();
        int hossz = rnd.nextInt(7-3+1)+3;
        for (int i = 0; i < hossz; i++) {
            System.out.print("\u001B[45m" + " ");
        }
        System.out.println();
    }
}
