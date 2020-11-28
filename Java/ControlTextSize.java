import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ControlTextSize extends JFrame {
    public ControlTextSize(){
        setTitle("+,- 키로 폰트 크기 조절");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel la = new JLabel("Love Java");
        la.setFont(new Font("Arial",Font.PLAIN,10));


        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(la);

        la.addKeyListener(new MyKeyListener());

        setSize(300,200);
        setVisible(true);

        la.setFocusable(true);
        la.requestFocus();
    }
    class MyKeyListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            JLabel label = (JLabel)e.getSource();
            if (e.getKeyChar() == '+') {
                Font f = label.getFont();
                int size = f.getSize();
                label.setFont(new Font("Arial", Font.PLAIN,size+5));
            }
            else if (e.getKeyChar() == '-'){
                Font f = label.getFont();
                int size = f.getSize();
                if (size<=5) return;
                label.setFont(new Font("Arial",Font.PLAIN,size-5));
            }
        }
    }

    public static void main(String[] args) {
        new ControlTextSize();
    }
}
