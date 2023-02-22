
package metodusokgyakorlas;


public class MetodusokGyakorlas {

    public static void main(String[] args) {
        int elso10osszeg = elso10szamOsszege();
        int osszeadasOsszeg = oszead(elso10osszeg, elso10osszeg);
        kiir(elso10osszeg);
        kiir(osszeadasOsszeg);
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
    public static void kiir(int osszeg) {
        System.out.printf("%d\n",osszeg);
    }
}
