import java.util.Random;

public class Terning {

    private static final String[] SYMBOL =
            {"", "[ . ]", "[ : ]", "[...]", "[: :]", "[:.:]", "[:::]"};
    private static final Random random = new Random();

    // aktuell verdi for terningen
    private int oyne;

    public Terning() {
        trill();
    }

    public int getOyne() {
        return oyne;
    }

    public static String getSymbol(int oyne) {
        return SYMBOL[oyne];
    }

    private void trill() {
        oyne = random.nextInt(6) + 1;
    }

    @Override
    public String toString() {
        return SYMBOL[oyne];
    }
}