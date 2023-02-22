
package metodusokgyakorlas;


public class MetodusokGyakorlas {

    public static void main(String[] args) {
        String szoveg;
        int a = 5;
        int b = 10;
        int c = 3;
        int d = 8;
        szoveg = "Az első 10 szám összege: %d.".formatted(elso10szamOsszege());
        kiir(szoveg);
        szoveg = "%d + %d = %d.".formatted(a, b, oszead(a, b));
        kiir(szoveg);
        szoveg = "%d + %d + %d + %d = %d.".formatted(a, b, c ,d, oszead(d, oszead(c, oszead(a, b))));
        kiir(szoveg);
        int osszeg = oszead(c, oszead(a, b));
        szoveg = "%d + %d + %d gyöke: %f.".formatted(a, b, c , Math.sqrt(osszeg));
        kiir(szoveg);
    }
    public static int elso10szamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
    }
    public static int oszead(int a, int b) {
        int osszeg = a + b;
        return osszeg;
    }
    public static void kiir(String szoveg) {
        System.out.println(szoveg);
    }
}
