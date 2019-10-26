import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import static javax.swing.JOptionPane.showMessageDialog;

public class GoBtnListener implements ActionListener {

    private JTextArea webpagetextarea;
    private JTextField urltextfield;

    public GoBtnListener(JTextArea webpagetextarea, JTextField urltextfield) {
        this.webpagetextarea = webpagetextarea;
        this.urltextfield = urltextfield;
    }

    public void actionPerformed(ActionEvent e) {

        // URL som bruker har testet inn i addresse-linjen
        String urlstr = urltextfield.getText();

        // skal lagre tekst som vi leser fra URL
        var text = new StringBuilder();

        Scanner in = null;

        // konstruer URL objekt

        try {
            URL url = new URL(urlstr);
            URLConnection connection = url.openConnection();

            // få en scanner som kan lese informasjon strøm av tekst fra url'en
            in = new Scanner(connection.getInputStream());

            int i = 1;
            while (i <= MyBrowser.MAX_LINES && in.hasNextLine()) {

                String linje = in.nextLine();

                System.out.println(linje);
                text.append(linje).append("\n");
            }

            // legg teksten som er lest fra URL'en inn i hovedvinduet
            webpagetextarea.setText(text.toString());

            in.close();

        } catch (MalformedURLException ex) {
            webpagetextarea.setText("Ulovlig url: " + ex.getMessage());
        } catch (IOException ex) {
            webpagetextarea.setText("Nettsiden finnes ikke: " + ex.getMessage());
        } finally {
            urltextfield.setText("https://");
        }
    }
}