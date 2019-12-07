package Oppgave1;

public class B {

    public static void main(String[] args) {

        mb(3);
    }

    public static void mb(int n) {
        for (int i = 0; i < n; i++) { // kjørt 3 ganger
            for (int j = i; j < n; j++) { // kjørt 3, 2, 1 ganger
                System.out.print("#");
                /*
                ###
                ##
                #
                 */
            }
            System.out.println();
        }
    }

}
