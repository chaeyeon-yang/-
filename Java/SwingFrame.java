import javax.swing.*;
import java.awt.*;

class NorthPanel extends JPanel{
    public NorthPanel(){
        setBackground(Color.lightGray);
        setLayout(new FlowLayout());
        add(new Button("Open"));
        add(new Button("Read"));
        add(new Button("Close"));
    }
}
class CenterPanel extends JPanel{
    public CenterPanel(){
        setLayout(null);
        JLabel a = new JLabel("Hello");
        a.setSize(100,20);
        a.setLocation(100, 10);

        JLabel b = new JLabel("Java");
        b.setSize(100,20);
        b.setLocation(20, 150);

        JLabel c = new JLabel("Love");
        c.setSize(100,20);
        c.setLocation(200, 120);

        add(a);
        add(b);
        add(c);
    }
}
public class SwingFrame extends JFrame {
    public SwingFrame(){
        setTitle("Open Challenge9");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(new NorthPanel(), BorderLayout.NORTH);
        c.add(new CenterPanel(), BorderLayout.CENTER);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingFrame();
    }
}
