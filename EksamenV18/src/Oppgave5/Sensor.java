package Oppgave5;

public class Sensor implements ISensor {

    private int temperatur = 20;
    private int delta = -1;
    private VarmePanel panel; // for simuleringen sin skyld

    public Sensor(VarmePanel panel) {
        this.panel = panel;
    }

    @Override
    public double leseav() {
        if (panel.getStatus()) {
            temperatur++;
        }
        else {
            temperatur--;
        }

        return temperatur;
    }
}
