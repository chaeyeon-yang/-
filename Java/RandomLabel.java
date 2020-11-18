import javax.swing.*;
import java.awt.*;

public class RandomLabel extends JFrame {
    public RandomLabel(){
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);


        for (int i=0; i<20; i++){
            int x = (int)(Math.random()*200)+50;
            int y = (int)(Math.random()*200)+50;
            JLabel jLabel = new JLabel();
            jLabel.setLocation(x,y);
            jLabel.setSize(10,10);
            jLabel.setOpaque(true);
            jLabel.setBackground(Color.BLUE);
            c.add(jLabel);
        }

        setSize(300,300);
        setVisible(true);

    }

    public static void main(String[] args) {
        new RandomLabel();

    }
}
