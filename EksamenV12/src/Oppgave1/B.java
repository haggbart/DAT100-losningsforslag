package Oppgave1;

public class B {
    public static void main(String[] args) {
        String streng = "abcde";
        String resultat = "";

        for (int i = 0; i < streng.length(); i+=2) {
            resultat += streng.charAt(i);
        }
        System.out.println(resultat); // ace
    }
}
