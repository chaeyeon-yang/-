import javax.swing.*;
import java.awt.*;

class Toppanel extends JPanel{
    public Toppanel(){
        setBackground(Color.lightGray);
        setOpaque(true);
        setLayout(new FlowLayout());
        add(new JButton("열기"));
        add(new JButton("닫기"));
        add(new JButton("나가기"));
    }
}
class BottomPanel extends JPanel{
    public BottomPanel(){
        setBackground(Color.YELLOW);
        JButton jb = new JButton("Word Input");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(jb);
        JTextField tf = new JTextField(16);
        add(tf);
    }
}
class CenteralPanel extends JPanel{
    public CenteralPanel(){
        setBackground(Color.WHITE);
        setLayout(null);
        for (int i=0; i<10; i++){
            int x = (int)(Math.random()*200)+10;
            int y = (int)(Math.random()*200)+10;
            JLabel la = new JLabel("*");
            la.setSize(20,20);
            la.setForeground(Color.RED);
            la.setLocation(x,y);
            add(la);
        }
    }
}
public class SwingProgram extends JFrame {
    public SwingProgram(){
        setTitle("여러 개의 패널을 가진 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(new Toppanel(), BorderLayout.NORTH);
        c.add(new CenteralPanel(), BorderLayout.CENTER);
        c.add(new BottomPanel(), BorderLayout.SOUTH);

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingProgram();
    }
}
