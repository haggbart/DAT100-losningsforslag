package Oppgave2;

public class Uketimer {

    private double dagTimer;
    private double nattTimer;
    private final double OVERTID_TIMER = 37.5;
    private final double NATT_TILLEGG = 1.40;
    private final double OVERTID_TILLEGG = 0.50;

    public Uketimer() {
        dagTimer = 0.0;
        nattTimer = 0.0;
    }

    public Uketimer(double dagTimer, double nattTimer) {
        this.dagTimer = dagTimer;
        this.nattTimer = nattTimer;
    }


    public void lesUkeTimer(double dagTimer, double nattTimer) {
        this.dagTimer = dagTimer;
        this.nattTimer = nattTimer;
    }

    public double getDagTimer() {
        return dagTimer;
    }

    public void setDagTimer(double dagTimer) {
        this.dagTimer = dagTimer;
    }

    public double getNattTimer() {
        return nattTimer;
    }

    public void setNattTimer(double nattTimer) {
        this.nattTimer = nattTimer;
    }

    public double finnUkeOvertid() {
        double timerTotalt = dagTimer + nattTimer;
        if (timerTotalt <= OVERTID_TIMER) return 0.0;
        return timerTotalt - OVERTID_TIMER;
    }

    public double finnUkeBrutto(double timelønn) {
        return dagTimer * timelønn +
                nattTimer * NATT_TILLEGG * timelønn +
                finnUkeOvertid() * OVERTID_TILLEGG * timelønn;
    }
}


