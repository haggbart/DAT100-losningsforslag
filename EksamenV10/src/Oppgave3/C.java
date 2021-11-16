package Oppgave3;

public class C {

    public static void main(String[] args) {
        int[] a1 = {13,18,12,5,20,22,18,28,30,35};
        System.out.println(maksAvstand(a1));
    }

    public static int maksAvstand(int[] a) {
        int maks = -1;
        int avstand;
        for (int i = 0; i < a.length-1; i++) {
            avstand = Math.abs(a[i+1] - a[i]);
            if (avstand > maks) maks = avstand;
        }
        return maks;
    }
}
