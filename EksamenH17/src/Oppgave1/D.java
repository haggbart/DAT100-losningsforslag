package Oppgave1;

public class D {

    public static void main(String[] args) {

    }

//    public static int md() {
//        boolean b = mc1(7);  // mc1 er void, returnerer ikke en boolean
//
//        int y = 6;
//        if (b) {
//            int x = y + 1;
//        }
//        return x; // x eksisterer ikke i scoopen.
//    }

    public static void mc1(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("+");
        }
        System.out.println();
    }
}
