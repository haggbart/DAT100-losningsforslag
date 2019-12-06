package Oppgave1;

public class E {
    public static void e() {
        String[] sTab = new String[4];
        sTab[0] = "a";
        sTab[1] = "ab";
        sTab[2] = "abc";
        // noter at sTab[3] vil være null
        int totalLengde = 0;
        try {
            for (int i = 0; i < sTab.length; i++) {
                totalLengde += sTab[i].length();
                System.out.println("Lengde så langt: " + totalLengde);
                /*
                0: Lengde så langt: 1
                1: Lengde så langt: 3
                2: Lengde så langt: 6
                 */
                // NullPointerException på sTab[3]
            }
            System.out.println("Total lengde av strengene: " + totalLengde); // blir ikke printet
        } catch (ArithmeticException e) {
            System.out.println("Unntak nr 1 kasta.");
        } catch (NullPointerException e) {
            System.out.println("Unntak nr 2 kasta.");
            // Unntak nr 2 kasta.
        } catch (Exception e) {
            System.out.println("Unntak nr 3 kasta.");
        }
    }

    public static void main(String[] args) {
        e();
    }
}
