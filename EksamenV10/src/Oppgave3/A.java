package Oppgave3;

public class A {

    public static void main(String[] args) {
        int[] a1 = {1,7,15,21};
        int[] a2 = {3,1,8,12};
        System.out.println(erSortertStigande(a1));
        System.out.println(erSortertStigande(a2));


    }
    public static boolean erSortertStigande(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i+1] < array[i]) return false;
        }
        return true;
    }
}
