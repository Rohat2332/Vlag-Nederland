import java.awt.*;
import java.applet.*;

public class Nederland extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.RED);
        g.fillRect(50, 60, 140, 50);
        g.setColor(Color.blue);
        g.fillRect(50, 150, 140, 50);
        g.setColor(Color.black);
        g.drawLine(50, 250, 50, 200);
    }
}