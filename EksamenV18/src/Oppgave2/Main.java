package Oppgave2;

public class Main {

    public static void main(String[] args) {
        Spiller roger = new Spiller("22.12.19", "Roger", 9);

        int[] par = { 6,4,3,3,5,7,5,4,6 };
        System.out.println(roger);
        roger.leggTil(5);
        roger.leggTil(4);
        roger.leggTil(3);
        roger.leggTil(5);
        roger.leggTil(5);
        roger.leggTil(2);
        System.out.println(roger);
        roger.leggTil(3);
        System.out.println(roger);
        roger.leggTil(1);
        roger.leggTil(6);
        roger.leggTil(1000);
        System.out.println(roger);
        System.out.println(roger.erFerdig());
        System.out.println(roger.antallOverPar(par));
        roger.visScore(par);

        Spiller preben = new Spiller("22.12.19", "Preben", 9);
        preben.leggTil(4);
        preben.leggTil(5);
        preben.leggTil(5);
        preben.leggTil(5);
        preben.leggTil(5);
        preben.leggTil(5);
        preben.leggTil(1);
        preben.leggTil(9);
        preben.leggTil(10);
        preben.visScore(par);
        System.out.println(vinner(roger, preben));
    }

    private static String vinner(Spiller spiller1, Spiller spiller2) {
        if (spiller1.sumSlag() == spiller2.sumSlag()) {
            return "Uavgjort";
        }
        String vinner = spiller1.sumSlag() < spiller2.sumSlag() ? spiller1.getNavn() : spiller2.getNavn();
        return vinner + " vant!";
    }
}
