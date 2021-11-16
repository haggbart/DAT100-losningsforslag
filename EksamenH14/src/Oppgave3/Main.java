package Oppgave3;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> frekvenser = new HashMap<>();

        String[] data = lesDataFraFil();


        // a
        for (String ord : data) { // vet at arrayen er full
            frekvenser.put(ord, frekvenser.getOrDefault(ord, 0) + 1);
        }

        // b
        Scanner input = new Scanner(System.in);
        System.out.print("Søk etter ord: ");
        String ord = input.nextLine();
        int frekvens = frekvenser.getOrDefault(ord, 0);
        System.out.println("Ord: " + ord + " - Frekvens: " + frekvens);


        // c
        System.out.println();
        System.out.println("Frekvenser: ");
        for (String s : frekvenser.keySet()) {
            System.out.println(s + ": " + frekvenser.get(s));
        }
    }

    public static String[] lesDataFraFil() { // laget for testing
        File file = new File("data.txt");
        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (Exception e) {
            System.out.println("error avlesning av fil");
            return null;
        }

        String[] data = new String[scanner.nextInt()];
        scanner.nextLine();

        for (int l = 0; l < data.length; l++) {
            data[l] = scanner.nextLine();
        }

        return data;
    }
}
