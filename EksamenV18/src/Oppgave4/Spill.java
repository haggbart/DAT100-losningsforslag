package Oppgave4;

public class Spill {

    public char [][] brett = {
            { 'I', 'I', 'I', 'I', 'I', 'I' },
            { 'I', 'I', 'I', 'I', 'I', 'I' },
            { 'B', 'I', 'G', 'G', 'G', 'I' },
            { 'B', 'B', 'G', 'G', 'B', 'B' }
    };

    public static void main(String[] args) {

        Spill spill = new Spill();
        spill.visTilstand();
        System.out.println(spill.hvilkenRekke(0));
        System.out.println(spill.hvilkenRekke(1));

        spill.plasserBrikke(0, 'B');
        spill.visTilstand();
        System.out.println(spill.sjekkVannrett(2, 1, 'G'));
        spill.plasserBrikke(1, 'G');
        spill.visTilstand();
        System.out.println(spill.sjekkVannrett(2, 1, 'G'));
        System.out.println(spill.fireVannrett(2, 'G'));
    }

    public boolean harTegn(int r, int k, char c) {
        return brett[r][k] == c;
    }

    public boolean ingenBrikke(int r, int k) {
        return harTegn(r, k, 'I');
    }

    public void visTilstand() {
        StringBuilder sb = new StringBuilder();
        for (char[] rad : brett) {
            for (char brikke : rad) {
                if (brikke == 'I') {
                    sb.append(' ');
                }
                else {
                    sb.append(brikke);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public int hvilkenRekke(int k) {
        for (int r = brett.length-1; r >= 0 ; r--) {
            if (ingenBrikke(r, k)) return r;
        }
        return -1;
    }

    public void plasserBrikke(int k, char c) {
        brett[hvilkenRekke(k)][k] = c;
    }

    public boolean sjekkVannrett(int r, int k, char c) {
        for (int i = 0; i < 4; i++) { // fire på rad og antar minst tre kolonner etter k
            if (brett[r][k+i] != c) return false;
        }
        return true;
    }

    public boolean fireVannrett(int r, char c) {
        for (int k = 0; k < brett[r].length-4; k++) {
            if (sjekkVannrett(r, k, c)) return true;
        }
        return false;
    }
}
