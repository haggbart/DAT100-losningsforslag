import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var temperaturer = new double[7];
        double maxTemp;
        double averageTemp;

        Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Analyse av temperaturer\n***********************");
        System.out.println("Skriv inn temperaturene:");

        for (int i = 0; i < temperaturer.length; i++) {
            System.out.print(i+1 + ". dag: ");
            temperaturer[i] = in.nextDouble();
        }

        maxTemp = temperaturer[0];
        int sum = 0;
        for (int i = 0; i < temperaturer.length; i++) {
            if (temperaturer[i] > maxTemp) maxTemp = temperaturer[i];
            sum += temperaturer[i];
        }

        averageTemp = sum/(double)temperaturer.length;

        System.out.println("\nGjennomsnittstemperaturen var " + getRounded(averageTemp, 1));
        System.out.println("Maksimum for denne uken var " + getRounded(maxTemp, 1) + " grader");
    }

    private static double getRounded(double number, int decimals) {
        double multiplier = 1;
        for (int i = 0; i < decimals; i++) {
            multiplier *= 10;
        }
        return (int)Math.round(number*multiplier) / multiplier;
    }
}
