public class Main {
    public static void main(String[] args) {

        // a
//        int antallOrd = Integer.parseInt(showInputDialog("Antall ord: "));
//
//        var ord = new String[antallOrd];
//
//        for (int i = 0; i < ord.length; i++) {
//            ord[i] = showInputDialog("Skriv inn ord #" + i+1 + ": ");
//        }

        String[] ord = { "heisann", "hoppsann", "aakek", "alpha", "abstrakt", "aaa", "hoi", "test", "s" }; // unngå å måtte skrive inn hver gang
        System.out.println("a)");
        skrivUt(ord);

        // b
//        String pattern = showInputDialog("Skriv inn et mønster: ");
        String pattern = "nn";
//
//
        int antallTreff = 0;
        for (String s : ord) {
            if (s.contains(pattern)) antallTreff++;
        }
        System.out.println("\nb)\nAntall treff: " + antallTreff);


        // c
        System.out.println("\nc)\nMidterste: ");
        for (String e : ord) {
            if (e.length() == 1) System.out.println(e);
            else if (e.length() % 2 == 0) System.out.println(e.substring(e.length() / 2 - 1, e.length() / 2 + 1));
            else System.out.println(e.substring(e.length() / 2 - 1, e.length() / 2 + 2));
        }

        // d
        System.out.println("\nd)\n" + ord[0]);
        System.out.println("Baklengs:");
        skrivBaklengs(ord[0]);

        // e
        System.out.println("\ne) f)\nFørst i alfabetet (egen compareto):");
        System.out.println(returnFirstAscending(ord));
    }

    private static void skrivUt (String[] array) {
        var sb = new StringBuilder();
        sb.append("[ ");
        for (String e : array) {
            sb.append(e);
            sb.append(", ");
        }
        sb.append("]");
        System.out.println(sb);
    }

    private static void skrivBaklengs(String string) {

        char[] chars = string.toCharArray();

        char e;
        for (int i = 0; i < chars.length / 2; i++) {
            e = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = e;
        }
        var reverse = String.copyValueOf(chars);
        System.out.println(reverse);
    }

    private static String returnFirstAscending(String[] strings) { // e // f
//        Arrays.sort(strings);
//        return strings[0];
        String result = strings[0];
//        for (String s : strings) {
//            if (s.charAt(0) < result.charAt(0)) result = s;
//        }

        for (int i = 0; i < strings.length - 1; i++) {
            //if (result.compareTo(strings[i+1]) > 0) { // e
            if (kekComparTo(result, strings[i+1]) > 0) { // f
                result = strings[i];
            }
        }

        return result;
    }

//    private static String returnFirstAscendingAlt(String[] strings) { // e // f
//
//        String result = strings[0];
//        for (String s : strings) {
//            if (s.charAt(0) < result.charAt(0)) result = s;
//        }
//
//        return result;
//    }


    /*
     If first string is lexicographically greater than second string, it returns positive number (difference of character value).
     If first string is less than second string lexicographically,
     it returns negative number and if first string is lexicographically equal to second string, it returns 0.
     */
    private static int kekComparTo(String aString, String anotherString) { // f
        int upperBounds = Math.min(aString.length(), anotherString.length());
        for (int i = 0; i < upperBounds; i++) {
            if (aString.charAt(i) != anotherString.charAt(i))
            return Character.getNumericValue(aString.charAt(i)) - Character.getNumericValue(anotherString.charAt(i));
        }
        return aString.length() - anotherString.length();
    }
}
