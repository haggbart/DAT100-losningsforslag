package Oppgave3;

public class A {
    public static void main(String[] args) {
        int[] tall = { 1,2,3,4 };
        System.out.println(produkt(tall));
    }

    public static long produkt(int[] array) {
        long sum = 1;
        for (int tall : array) {
            sum *= tall;
        }
        return sum;
    }
}
