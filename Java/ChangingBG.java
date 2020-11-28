import javax.swing.*;
import javax.swing.text.AbstractDocument;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChangingBG extends JFrame {
    public ChangingBG(){
        setTitle("드래깅동안 YELLOW");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setBackground(Color.GREEN);

        c.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Component c = (Component)e.getSource();
                c.setBackground(Color.YELLOW);
            }
        });

        c.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                Component c = (Component)e.getSource();
                c.setBackground(Color.GREEN);
            }
        });
        setSize(300,200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new ChangingBG();
    }
}
