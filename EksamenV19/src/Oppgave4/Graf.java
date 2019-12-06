package Oppgave4;

public class Graf {
    public static void main(String[] args) {
        Graf graf = new Graf();
        System.out.println("Grad: " + graf.grad(0));
        System.out.println();

        System.out.println("Løkker: " + graf.antallLokker());
        System.out.println();

        int[] mengde = { 3, 1  };

        System.out.println("Uavhengig: " + graf.uavhengigMengde(mengde));

    }
    // matrisen i eksemplet over
    private boolean[][] nabomatrise = {
            { false, true, false, true, false, false },
            { true, false, true, false, true, true },
            { false, true, false, false, false, true },
            { true, false, false, false, false, false },
            { false, true, false, false, false, true },
            { false, true, true, false, true, false }
    };

    public boolean erNaboer(int u, int w) {
        return nabomatrise[u][w];
    }

    public int grad(int v) {
        int grad = 0;
        for (boolean nabo : nabomatrise[v]) {
            if (nabo) grad++;
        }
        return grad;
    }

    public int antallLokker() { // c
        int antall = 0;
        for (int i = 0; i < nabomatrise.length; i++) {
            if (nabomatrise[i][i]) antall++;
        }
        return antall;
    }

    public boolean uavhengigMengde (int[] s) {
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (i == j) continue;
                if (erNaboer(s[i], s[j])) return false;
            }
        }
        return true;
    }
}