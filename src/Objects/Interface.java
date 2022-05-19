package Objects;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Interface extends JPanel {
    public Image background;
    public Interface() {
        ImageIcon reference = new ImageIcon("res\\background.png");
        background = reference.getImage();
    }
    public void paint(Graphics g) {
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(background, 0, 0, null);
        g.dispose();
    }
}
