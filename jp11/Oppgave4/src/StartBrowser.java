
import javax.swing.*;

public class StartBrowser {

    public static void main(String[] args) {

        // a bit of voodoo so start the Swing UI thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MyBrowser();
            }
        });
    }
}