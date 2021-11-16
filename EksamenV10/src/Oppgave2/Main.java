package Oppgave2;

public class Main {
    public static void main(String[] args) {

        Tidspunkt tid1 = new Tidspunkt("14:30");
        Tidspunkt tid2 = new Tidspunkt("15:30");
        Tidspunkt tid3 = new Tidspunkt("15:00");
        Tidspunkt tid4 = new Tidspunkt("16:00");
        Timeregistrering timereg = new Timeregistrering("12.12.19", tid1, tid2, "Sosial loffing");
        Timeregistrering timereg2 = new Timeregistrering("12.12.19", tid3, tid4, "Drikket litt te");
        System.out.println(tid1.somTimer());
        System.out.println(tid1.somMinutter());


        System.out.println(tid1);
        System.out.println(timereg.beregnAntallTImer());
        System.out.println(timereg.overlapper(timereg2));
        System.out.println(Timeregistrering.overskrift());
        System.out.println(timereg);
        System.out.println();
        System.out.println();

        Timeliste timeliste = new Timeliste("Roger", 550);
        timeliste.leggTil("12.12.19", "10:00", "12:00", "sosial loffing");
        timeliste.leggTil("12.12.19", "12:15", "13:00", "drukket te");
        timeliste.leggTil("12.12.19", "13.15", "18:00", "gamet");
        timeliste.skrivUt();
    }
}
