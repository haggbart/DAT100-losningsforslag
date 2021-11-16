package Oppgave5;

public class Login {

    public static void main(String[] args) {
        boolean[][] monster1 = {
                { true, false, false },
                { true, true, true },
                { false, false, true }
        };

        boolean[][] monster2 = {
                { true, false, false },
                { true, true, true },
                { false, true, true }
        };

        Login login = new Login();
        login.skrivUt();
        System.out.println(login.sjekkMonster(monster1));
        System.out.println(login.sjekkMonster(monster2));
        System.out.println(login.erMed(0,0));
        System.out.println(login.erMed(0, 1));
    }

    private boolean[][] monster = {
            { true, false, false },
            { true, true, true },
            { false, false, true }
    };


    // a
    public boolean erMed(int r, int k) {
        if (!(r >= 0 || r < monster.length)) return false; // står i oppgaven at dette skal med
        if (!(k >= 0 || k < monster[0].length)) return false;
        return monster[r][k];
    }

    // b
    public void skrivUt() {
        StringBuilder sb = new StringBuilder();
        for (boolean[] rad : monster) {
            for (boolean bool : rad) {
                if (bool) sb.append('*');
                else sb.append(' ');
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public boolean sjekkMonster(boolean[][] monster) {
        for (int r = 0; r < this.monster.length; r++) {
            for (int k = 0; k < this.monster[r].length; k++) {
                if (this.monster[r][k] != monster[r][k]) return false;
            }
        }
        return true;
    }
}
