package Oppgave3;

import java.util.Random;

public class TilfeldigeTall {
    private Random random;
    private int min;
    private int max;

    public TilfeldigeTall(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    public int nesteTall() {
        return random.nextInt(max - min + 1) + min;
    }

}
