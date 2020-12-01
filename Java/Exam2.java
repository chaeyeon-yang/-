import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Exam2 extends JFrame {

    private static int Num = 0;
    JLabel la = new JLabel("count = "+Num);
    public Exam2(){
        setTitle("Counter 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        la.setSize(100,20);
        la.setLocation(100,50);

        Container c = getContentPane();
        c.setLayout(null);
        c.add(la);
        c.addKeyListener(new MyKeyListener());

        setSize(300,200);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int keycode = e.getKeyCode();
            if (keycode == KeyEvent.VK_UP) {
                Num++;
                la.setText("count = " + Num);
            }
            if (keycode == KeyEvent.VK_DOWN) {
                Num--;
                la.setText("count = " + Num);
            }
        }

    }

    public static void main(String[] args) {
        new Exam2();
    }
}
