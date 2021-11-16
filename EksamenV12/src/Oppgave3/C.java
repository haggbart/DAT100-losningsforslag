package Oppgave3;

import java.util.Arrays;

public class C {

    public static void main(String[] args) {
        String[] passord = {"passord","123","hemmelig","tull"};
        System.out.println(Arrays.toString(filtrerLovligePassord(passord)));
    }

//    public static String[] filtrerLovligePassord(String[] allePassord) {
//
//        int antallLovlige = 0;
//        for (int i = 0; i < allePassord.length; i++) {
//            if (lovligPassord(allePassord[i])) antallLovlige++;
//        }
//
//        String[] lovlige = new String[antallLovlige];
//
//        int nyIndex = 0;
//        for (int i = 0; i < allePassord.length; i++) {
//            if (lovligPassord(allePassord[i])) {
//                lovlige[nyIndex] = allePassord[i];
//                nyIndex++;
//            }
//        }
//        return lovlige;
//    }

    public static String[] filtrerLovligePassord(String[] allePassord) {

        String[] rawLovlige = new String[allePassord.length];
        int rawIndex = 0;

        for (String passord : allePassord) {
            if (lovligPassord(passord)) {
                rawLovlige[rawIndex] = passord;
                rawIndex++;
            }
        }

        String[] lovlige = new String[rawIndex]; // arraycopy til ny array med kjent lengde
        for (int i = 0; i < rawIndex; i++) {
            lovlige[i] = rawLovlige[i];
        }
        return lovlige;
    }

    public static boolean lovligPassord(String passord) {
        return (passord.length() >= 6);
    }
}
