package Oppgave3;

public class A {
    public static void main(String[] args) {
        int[] tall1 = {1,2,5,6};
        int[] tall2 = {1,4,5,2,6};
        System.out.println(erSortert(tall1));
        System.out.println(erSortert(tall2));
    }

    public static boolean erSortert(int[] array) {
        for (int i = 0; i < array.length-1; i++) {

            if (array[i] > array[i+1]) return false;
        }
        return true;
    }
}
