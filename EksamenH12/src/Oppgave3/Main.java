package Oppgave3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // a)
        Scanner input = new Scanner(System.in);
        System.out.print("Min: ");
        int min = input.nextInt();
        input.nextLine();

        System.out.print("Maks: ");
        int max = input.nextInt();
        input.nextLine();

        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }

        TilfeldigeTall tilfeldig = new TilfeldigeTall(min, max);

        int sum = 0;
        int antall = 100;
        for (int i = 0; i < antall; i++) {
            sum += tilfeldig.nesteTall();
        }

        System.out.println("Gjennomsnitt: " + sum/(double)antall);

    }



}
