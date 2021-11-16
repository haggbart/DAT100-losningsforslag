package Oppgave3;


public class B {
    public static void main(String[] args) {

        String[] strenger = {"abc","123","def","6174"};
        System.out.println(snittLengde(strenger));
    }

    public static double snittLengde(String[] strenger) {

        double sum = 0;
        for (int i = 0; i < strenger.length; i++) {
            sum += strenger[i].length();
        }
        return sum/strenger.length;
    }
}
