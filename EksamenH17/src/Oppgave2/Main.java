package Oppgave2;

public class Main {


    public static void main(String[] args) {
        Flyavgang avgang1 = new Flyavgang(23, "Bergen", "14:30", 'b');

        Flyavganger flyavganger = new Flyavganger(10);

        flyavganger.settInn(avgang1);
        flyavganger.settInn(new Flyavgang(40, "oslo", "11:20", 'o'));
        flyavganger.visInfo();

        System.out.println(flyavganger.antall());

    }
}
