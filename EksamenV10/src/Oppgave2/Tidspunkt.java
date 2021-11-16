package Oppgave2;

public class Tidspunkt {
    private int time;
    private int minutt;


    public Tidspunkt(int time, int minutt) {
        if (gyldigTime(time) && gyldigMinutt(minutt)) {
            this.time = time;
            this.minutt = minutt;
        }
        else {
            this.time = 0;
            this.minutt = 0;
        }
    }

    public Tidspunkt(String tt_mm) {
        if (!gyldigTidspunkt(tt_mm)) {
            time = 0;
            minutt = 0;
        }
        else {
            time = Integer.parseInt(tt_mm.substring(0,2));
            minutt = Integer.parseInt(tt_mm.substring(3,5));
        }
    }

    private boolean gyldigMinutt(int minutt) {
        return minutt < 60 && minutt % 5 == 0;
    }

    private boolean gyldigTime(int time) {
        return time < 24;
    }

    private boolean gyldigTidspunkt(String tt_mm) {

        return gyldigTime(Integer.parseInt(tt_mm.substring(0,2)))
                && gyldigMinutt(Integer.parseInt(tt_mm.substring(3,5)));
    }

    public double somTimer() {
        return time + minutt / 60.0;
    }

    public int somMinutter() {
        return time * 60 + minutt;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", time, minutt);
    }
}
