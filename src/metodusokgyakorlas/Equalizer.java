/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodusokgyakorlas;

import java.util.Random;

    

public class Equalizer {
    static Random rnd = new Random();
    
    public static void main(String[] args) {
        feladatok();
    }

    private static void feladatok() {
        eq();
        eq(5);
        eq(true);
        eq(11, true);
        eq(8);
    }
    public static void eq(int szam) {
        int hossz = szam;
        kiirasCiklus(hossz);
        System.out.println();
    }
    public static void eq() {
        int hossz = rnd.nextInt(7-3+1)+3;
        kiirasCiklus(hossz);
        System.out.println();
    }
    public static void eq(int szam, boolean meret) {
        int hossz = szam;
        kiirasCiklus(hossz);
        meretKiiras(meret, hossz);
        System.out.println();
    }
    public static void eq(boolean meret) {
        int hossz = rnd.nextInt(7-3+1)+3;
        kiirasCiklus(hossz);
        meretKiiras(meret, hossz);
        System.out.println();
    }
    static void kiirasCiklus(int hossz) {
        for (int i = 0; i < hossz; i++) {
            System.out.print("\u001B[45m" + " ");
        }
    }
    private static void meretKiiras(boolean meret, int hossz) {
        if (meret) {
            System.out.printf("\u001B[0m(%d)".formatted(hossz));
        }
    }
}
