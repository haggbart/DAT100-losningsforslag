package Oppgave2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Målestasjon bergen = new Målestasjon("001");
        bergen.setNavn("Bergen");
        Målestasjon forde = new Målestasjon("002");
        forde.setNavn("Førde");

        visInfo(bergen, forde);
    }

    private static void visInfo(Målestasjon stasjon1, Målestasjon stasjon2) {


        System.out.println("Måling for målestasjonene \"" + stasjon1.getNavn() + "\" og \"" + stasjon2.getNavn() + "\"");
        try {
            double temp1 = stasjon1.getTemperatur();
            double temp2 = stasjon2.getTemperatur();
            System.out.printf("%s: %.2f grader, %s: %.2f grader%n", stasjon1.getNavn(), temp1,
                    stasjon2.getNavn(), temp2);

            double delta;
            boolean varmere = false;
            if (temp1 > temp2) {
                delta = temp1 - temp2;
                varmere = true;
            }
            else delta = temp2 - temp1;

            if (delta < 0.01) {
                System.out.println(stasjon1.getNavn() + " og " + stasjon2.getNavn() + " har samme temperatur.");
            } else {
                System.out.println(stasjon1.getNavn() + " er " + String.format("%.2f", delta) +
                        (varmere ? " varmere " : " kaldere ") + "enn " + stasjon2.getNavn());
            }

        } catch (IOException e) {
            System.out.println("Feilmelding: Får ikke kontakt med en eller flere av målestasjonene");
        }



    }
}
