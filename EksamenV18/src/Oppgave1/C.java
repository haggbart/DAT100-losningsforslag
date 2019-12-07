package Oppgave1;

public class C {

    public static void main(String[] args) {
        mc();
    }

    public static void mc() {
        int i = 5;

        do {
            System.out.println(i);
            /*
            5
            3
            1
             */
            i = i - 2;
        }
        while (i > 0);
    }
}
