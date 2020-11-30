import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LoveYa extends JFrame {
    public LoveYa(){
        setTitle("마우스 올리고! 내리고~!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel la = new JLabel("Love Java");
        c.add(la);

        la.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JLabel la = (JLabel)e.getSource();
                la.setText("Love Java");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                JLabel la = (JLabel)e.getSource();
                la.setText("사랑해");
            }
        });

        setSize(250,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoveYa();
    }
}
