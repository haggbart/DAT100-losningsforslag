package Oppgave2;

public class Flyavganger {

    private Flyavgang[] flyavganger;

    public Flyavganger(int storrelse) {
        flyavganger = new Flyavgang[storrelse];
    }


    public boolean erNull(int posisjon) {
        return flyavganger[posisjon] == null;
    }

    public int antall() {
        int antall = 0;
        for (int i = 0; i < flyavganger.length; i++) {
            if (!erNull(i)) {
                antall++;
            }
        }
        return antall;
    }

    public void visInfo() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < flyavganger.length; i++) {
            if (!erNull(i)) {
                sb.append(flyavganger[i]);
            }
        }
        System.out.println(sb.toString());
    }

    public boolean setStatus(int nummer, char status) {
        for (int i = 0; i < flyavganger.length; i++) {
            if (erNull(i)) continue;
            if (flyavganger[i].getNummer() == nummer) {
                flyavganger[i].setStatus(status);
                return true;
            }
        }
        return false;
    }

    public boolean settInn(Flyavgang flyavgang) {
        for (int i = 0; i < flyavganger.length; i++) {
            if (!erNull(i)) continue;
            flyavganger[i] = flyavgang;
            return true;
        }
        return false;
    }

    public boolean slett(int nummer) {
        for (int i = 0; i < flyavganger.length; i++) {
            if (erNull(i)) continue;
            if (flyavganger[i].getNummer() == nummer) {
                flyavganger[i] = null;
                return true;
            }
        }
        return false;
    }
}
