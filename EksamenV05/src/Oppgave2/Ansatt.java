package Oppgave2;


import java.util.Scanner;

public class Ansatt {
    private static final String[] KATEGORI = { "", "hotelldirektør", "resepsjonistsjef", "resepsjonist",
            "piccolo", "oldfrue", "stuepike", "kokk", "kelner", "ryddehjelp"};
    public static final int MAKS_KATEGORI = 9;

    private int ansattNr;
    private String navn;
    private int stillingsKode;
    private double timeGrunnlønn;
    private Uketimer[] timelister = new Uketimer[52];


    public Ansatt() {
        ansattNr = 0;
        navn = "";
        stillingsKode = 0;
        timeGrunnlønn = 0;
    }

    public void lesAnsatt(int ansattNr, String navn, int stillingsKode, double timeGrunnlønn) {
        if (stillingsKode < 0 || stillingsKode > KATEGORI.length-1) stillingsKode = 0;
        this.ansattNr = ansattNr;
        this.navn = navn;
        this.stillingsKode = stillingsKode;
        this.timeGrunnlønn = timeGrunnlønn;
    }

    public int getAnsattNr() {
        return ansattNr;
    }

    public String getNavn() {
        return navn;
    }

    public String hentStillingsNavn(int kode) {
        return KATEGORI[kode];
    }

    public boolean registrertData(int ukenr) {
        return timelister[ukenr] != null;
    }

    public void registrerTimer(int ukenr) {
        Scanner input = new Scanner(System.in);
        boolean ja;
        if (registrertData(ukenr)) {
            System.out.print("Allerede registret timer for uke " + ukenr + ".\n" +
                    "Vil du overskrive disse? ");
            ja = input.nextLine().toLowerCase().charAt(0) == 'j';
            if (!ja) return;
        }
        System.out.print("Dagtimer?");
        timelister[ukenr].setDagTimer(input.nextInt());
        input.nextLine();
        System.out.print("Nattimer?");
        timelister[ukenr].setNattTimer(input.nextInt());
        input.nextLine();
    }

    public double finnAarsBrutto() {
        double aarsbrutto = 0;
        for (Uketimer timeliste : timelister) {
            aarsbrutto += timeliste.finnUkeBrutto(timeGrunnlønn);
        }
        return aarsbrutto;
    }
}