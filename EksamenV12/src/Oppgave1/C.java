package Oppgave1;

public class C {
    public static void main(String[] args) {
        int desimalt = 2;
        switch (desimalt) {
            case 0:
                System.out.println("00");
            case 1:
                System.out.println("01");
            case 2:
                System.out.println("10"); // 10
            case 3:
                System.out.println("11"); // 11 (ingen break)
        }
    }
}
