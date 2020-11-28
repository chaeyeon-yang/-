import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LeftingText extends JFrame {
    public LeftingText(){
        setTitle("Left 키로 문자열 이동");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel la = new JLabel("Love Java");
        c.add(la);
        la.addKeyListener(new MyKeyListener());

        setSize(300,200);
        setVisible(true);

        la.setFocusable(true);
        la.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            JLabel label = (JLabel) e.getSource();
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                String text = label.getText();
                String result = text.substring(1) + text.substring(0, 1);
                label.setText(result);
            }
        }
    }


    public static void main(String[] args) {
        new LeftingText();
    }
}
