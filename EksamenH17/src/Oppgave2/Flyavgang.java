package Oppgave2;

public class Flyavgang {
    private int nummer;
    private String destinasjon;
    private String tid;
    private char status;

    public Flyavgang(int nummer, String destinasjon, String tid, char status) {
        this.nummer = nummer;
        this.destinasjon = destinasjon;
        this.tid = tid;
        this.status = status;
    }

    public int getNummer() {
        return nummer;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String status;
        switch (this.status) {
            case 'o':
                status = "on-time";
                break;
            case 'g':
                status = "go-to-gate";
                break;
            case 'b':
                status = "boarding";
                break;
            case 'c':
                status = "gate-closed";
                break;
            default:
                status = "-";
                break;
        }
        return nummer + " " + destinasjon + " " + tid + " " + status + "\n";
    }
}
