package Oppgave1;

public class D {
    public static void main(String[] args) {
        einD();
    }

    public static void einD() {
        int a = 11;
        String s = new String("Høgskolen i Bergen");
        String t = new String("Høgskolen i Bergen");

        System.out.println(a-7/2); // 11 - 3 = 8
        System.out.println((a%2)==1); // true
        System.out.println(s.substring(2,5)); // gsk (parameter 2 er exclusive (char 2-4)
        System.out.println(s == t); // false (2 forskjellige objekter)
        System.out.println(s.equals(t)); // true
    }
}
