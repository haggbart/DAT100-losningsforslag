package Oppgave5;

public class VarmePanel implements IKontrol {

    private boolean status;
    private IAktuator aktuator;

    public VarmePanel(IAktuator aktuator) {
        this.aktuator = aktuator;
        status = false;
    }

    @Override
    public void on() {
        if (!status) {
            status = true;
            System.out.println("Ovn skrudd på");
        }
    }

    @Override
    public void off() {
        if (status) {
            status = false;
            System.out.println("Ovn skrudd av");
        }
    }

    @Override
    public boolean getStatus() {

        return status;
    }
}
