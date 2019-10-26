public class MiniExcel {

    private static int[][] data =
            {
                    { 1, 2, 0 },
                    { 3, 4, 0 },
                    { 5, 6, 0 },
                    { 1, 2, 0 },
                    { 0, 0, 0 }
            };

    private static void skrivUt() {

        // TODO - START

        final String STREK = "---------------\n";

        var sb = new StringBuilder(STREK);

        // iterer igjennom tabellen og skriv ut - foreach-løkke
        for (var rad : data) {
            for (var tall : rad) {
                sb.append(tall).append(" ");
            }
            sb.append("\n");
        }

        sb.append(STREK);

        System.out.println(sb.toString());

        // TODO _END
    }

    private static void beregnSum() {

        // TODO - START

        int hoyde = data.length;
        int bredde = data[0].length;

        int sum;
        int[] sumkol = new int[bredde];
        int tall;

        // summer hver rad, kolonne og sett summen i siste element i hver rad
        for (int rad = 0; rad < hoyde - 1; rad++) {
            sum = 0;
            for (int i = 0; i < bredde - 1; i++) {
                tall = data[rad][i];
                sum += tall;
                sumkol[i] += tall;
            }
            data[rad][bredde - 1] = sum;
            sumkol[bredde - 1] += sum;
        }

        // sett kolonnesum i siste element
        System.arraycopy(sumkol, 0, data[hoyde - 1], 0, bredde);

        // TODO - END
    }

    public static void main(String[] args) {

        skrivUt();

        beregnSum();

        skrivUt();
    }
}