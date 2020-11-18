
import javax.swing.*;
import java.awt.*;

public class Grid_prac3 extends JFrame {
    public Grid_prac3(){
        setTitle("4x4 Color Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(4,4));

        JLabel[] jLabel = new JLabel[16];
        Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
                Color.PINK, Color.lightGray, Color.WHITE, Color.DARK_GRAY, Color.BLACK, Color.ORANGE,
                Color.BLUE, Color.MAGENTA};

        for (int i=0; i<jLabel.length; i++){
            jLabel[i] = new JLabel(Integer.toString(i));
            jLabel[i].setOpaque(true);
            jLabel[i].setBackground(colors[i]);
            c.add(jLabel[i]);
        }

        setSize(500,200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Grid_prac3();
    }
}
