import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

class NPanel extends JPanel{
    public NPanel(){
        setBackground(Color.lightGray);
        setOpaque(true);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JLabel("수식입력"));
        add(new JTextField(30));
    }
}

class SPanel extends JPanel{
    public SPanel(){
        setBackground(Color.YELLOW);
        setOpaque(true);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JLabel("계산 결과"));
        add(new JTextField(30));
    }
}
class CPanel extends JPanel{
    public CPanel(){
        setBackground(Color.WHITE);
        setOpaque(true);
        setLayout(new GridLayout(4,4,5,5));
        JButton[] btn = {new JButton("+"), new JButton("-"), new JButton("x"),
                            new JButton("/")};
        for (int i=0; i<10; i++){
            JButton jButton = new JButton(Integer.toString(i));
            add(jButton);
        }
        add(new Button("CE"));
        add(new Button("계산"));
        for (int i=0; i<btn.length; i++){
            btn[i].setBackground(Color.CYAN);
            add(btn[i]);
        }
    }
}
public class CalculateSwingFrame extends JFrame {
    public CalculateSwingFrame(){
        setTitle("계산기 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(new NPanel(), BorderLayout.NORTH);
        c.add(new SPanel(), BorderLayout.SOUTH);
        c.add(new CPanel(), BorderLayout.CENTER);

        setSize(400,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculateSwingFrame();
    }
}
