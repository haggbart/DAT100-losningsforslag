package Oppgave5;

public class Main {
    public static void main(String[] args) {

        IAktuator aktuator = new Aktuator();
        VarmePanel panel = new VarmePanel(aktuator);
        ISensor sensor = new Sensor(panel);

        smartPanel(sensor, panel, 30);

    }

    public static void smartPanel(ISensor sensor,
                                  VarmePanel panel, double grense) {

        while (true) {
            double temperatur = sensor.leseav();
            System.out.println("Temperatur: " + temperatur);
            if (temperatur < grense) {
                System.out.println("Temperatur under " + grense);
                panel.on();
            }
            else {
                System.out.println("Temperatur over " + grense);
                panel.off();
            }
            vent(60);
        }
    }

    private static void vent(int secs) {
        try {
            Thread.sleep(secs * 10); // speedet opp 100x for testing
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
