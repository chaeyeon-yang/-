import javax.swing.*;
import java.awt.*;


public class Grid_prac2 extends JFrame {
    public Grid_prac2(){
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(1,10));

        Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                            Color.CYAN, Color.BLUE, Color.MAGENTA, Color.DARK_GRAY,
                            Color.PINK, Color.GRAY};

        JButton[] btn = new JButton[10];
        for (int i=0; i<btn.length; i++){
            btn[i] = new JButton(Integer.toString(i));
            btn[i].setBackground(colors[i]);
            c.add(btn[i]);
        }

        setSize(500,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Grid_prac2();
    }
}
