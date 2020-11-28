import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class JavaTextBackward extends JFrame {


    public JavaTextBackward(){
        setTitle("Left 키로 문자열 교체");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel label = new JLabel("Love Java");
        c.add(label);

        label.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT){
                    JLabel la = (JLabel)e.getSource();
                    StringBuffer text = new StringBuffer(la.getText());
                    la.setText(text.reverse().toString());
                }
            }
        });
        setSize(300,200);
        setVisible(true);
        label.setFocusable(true);
        label.requestFocus();
    }

    public static void main(String[] args) {
        new JavaTextBackward();
    }
}
