package Oppgave3;

public class MainB {

    private static String[] endimArray = {
            "1", "2", "3", "4", "5"
    };
    private static String[][] todimArray = {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"}
    };

    public static void main(String[] args) {

        snuRekkefolgen(endimArray);
        printArray(endimArray);

        for (String[] rad : todimArray) {
            snuRekkefolgen(rad);
        }

        for (String[] rad : todimArray) {
            printArray(rad);
        }
    }

    private static void printArray(String[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (String s : array) {
            sb.append(s).append(", ");
        }
        sb.replace(sb.length()-2, sb.length()-1, "]");
        System.out.println(sb);
    }

    public static void snuRekkefolgen(String[] array) {

        String temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
    }
}
