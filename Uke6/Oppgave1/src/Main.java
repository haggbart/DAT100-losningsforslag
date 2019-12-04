import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Oppgave 1
        // a,b
        System.out.println("a) og b)");
        int[] array = { 1, 2, 3, 4, 5 };
        skrivUt(array);
        int sum = summer(array);
        System.out.println("Sum: " + sum);

        // c
        System.out.println("\nc)\nFinnes tall: " + finnesTall(array, 10));

        // d
        System.out.println("\nd)\nPosisjon tall: " + posisjonTall(array, 3));

        // e
        System.out.println("\ne)\nFør: ");
        skrivUt(array);
        System.out.println("Etter: ");
        skrivUt(reverser(array));

        // f
        System.out.println("\nf)\n");
        skrivUt(array);
        System.out.println("Er sortert: " + erSortert(array));

        // g
        int[] array2 = { 2, 4, 9, 1 };
        System.out.println("\ng)\nSett sammen: ");
        skrivUt(settSammen(array, array2));

        // testing
        int[] testArray = { 1, 2, 3, 4, 5 };
        int[] testArray2 = { 6, 7, 8, 9, 0};

        System.out.println("\n\n");



        //insertArray(testArray, testArray2, 0);
        var newArray = new int[20];

        int index = insertArray(testArray,newArray,0);
        insertArray(testArray2, newArray, index);

        System.out.println(Arrays.toString(newArray));
    }

    private static void skrivUt(int[] array) {
        var sb = new StringBuilder();
        int max = array.length - 1;
        if (max == -1)
            System.out.println("[]");
        sb.append("[");
        for (int i = 0;;i++) {
            sb.append(array[i]);
            if (i == max) {
                sb.append("]");
                break;
            }
            sb.append(", ");
        }
        System.out.println(sb);
    }

    private static int summer(int[] array) {
        int sum;
        sum = forlokke(array);
        System.out.println("for-løkke: " + sum);
        sum = whilelokke(array);
        System.out.println("while-løkke: " + sum);
        sum = utvidetforlokke(array);
        System.out.println("utvidet for-løkke: " + sum);

        return sum;
    }

    private static int utvidetforlokke(int[] array) {
        int sum = 0;
        for (int e : array) {
            sum += e;
        }
        return sum;
    }

    private static int whilelokke(int[] array) {
        int i = 0;
        int sum = 0;
        while (i < array.length) {
            sum += array[i];
            i++;
        }
        return sum;
    }

    private static int forlokke(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static boolean finnesTall(int[] array, int tall) { // c
        for (int i = 0; i < array.length; i++) {
            if (array[i] == tall) return true;
        }
        return false;
    }

    private static int posisjonTall(int[] array, int tall) { // d) feil i oppgave, bør returnere int og ikke bool?
        for (int i = 0; i < array.length; i++) {
            if (array[i] == tall) return i;
        }
        return -1;
    }

    private static int[] reverser(int[] array) { // e
//        int e; // returnerer ikke ny tabell, men gjør om på samme
//        for (int i = 0; i < array.length / 2; i++) {
//            e = array[i];
//            array[i] = array[array.length - 1 - i];
//            array[array.length - 1 - i] = e;
//        }
//        return array;
        var reverse = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length - 1 - i];
        }
        return reverse;
    }

    private static boolean erSortert(int[] array) { // f
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) return false;
        }
        return true;
    }

    private static int[] settSammen(int[] array1, int[] array2) { // g
        var newArray = new int[array1.length + array2.length];
        int startIndex = 0;
        startIndex = insertArray(array1, newArray, startIndex);
        insertArray(array2, newArray, startIndex);
        return newArray;
    }


    /**
     * Returns the destPos + length of the added array
     * @param src       source array
     * @param dest      destionation array
     * @param destPos   start index
     * @return destPos of the last inserted element from source
     */
    private static int insertArray(int[] src, int[] dest, int destPos) { // g
        if (src.length + destPos > dest.length) return -1;
        int i = 0;
        for (; i < src.length; i++) {
            dest[i + destPos] = src[i];
        }
        return i + destPos;
    }
}
