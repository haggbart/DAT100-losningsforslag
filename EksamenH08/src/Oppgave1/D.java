package Oppgave1;

public class D {

    public static void main(String[] args) {
        oppgave1d();
    }

    public static void oppgave1d() {
        String s1 = new String("Ein streng");
        String s2 = new String("Ein streng");

        System.out.println(10-4*2); // 2
        System.out.println(3+7/2); // 6
        System.out.println(5 % 2); // 1
        System.out.println(s1.substring(1,5)); // in s (parameter 2 er exclusive)
        System.out.println(s1 == s2); // false (ulikt objekt)
        System.out.println(s1.equals(s2));
    }
}
