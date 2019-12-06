package Oppgave5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listeAvOrd = new ArrayList<>(){
            {
                add("er");
                add("det");
                add("alle");
                add("er");
                add("det");
                add("det");
            }
        };

        HashMap<String, Integer> fo = new HashMap<>();

        for (String s : listeAvOrd) {
            fo.put(s, fo.getOrDefault(s, 0) + 1);
        }


        for (String k : fo.keySet()) {

            System.out.println(k + ": " + fo.get(k));
        }

        Scanner input = new Scanner(System.in);
        String ord = input.nextLine();

        System.out.println(ord + " har frekvens " + fo.getOrDefault(ord, 0));


    }
}
