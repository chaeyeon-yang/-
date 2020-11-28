import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Gambling extends JFrame {
    public Gambling(){
        setTitle("Open Challenge 10");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new GamePanel());

        setSize(300,200);
        setVisible(true);

        getContentPane().setFocusable(true);
        getContentPane().requestFocus();
    }
    class GamePanel extends JPanel{
        private JLabel la[] = new JLabel[3];
        private JLabel result = new JLabel("시작합니다.");
        public GamePanel(){
            setLayout(null);

            for (int i=0; i<la.length; i++){
                la[i] = new JLabel("0");
                la[i].setSize(60,30);
                la[i].setLocation(30+80*i, 50);
                la[i].setHorizontalAlignment(JLabel.CENTER);
                la[i].setOpaque(true);
                la[i].setBackground(Color.MAGENTA);
                la[i].setForeground(Color.YELLOW);
                la[i].setFont(new Font("Tahoma", Font.ITALIC, 30));
                add(la[i]);
            }



            result.setSize(200,20);
            result.setLocation(100,120);
            add(result);

            addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_ENTER){
                        int x = (int)(Math.random()*5);
                        la[0].setText(Integer.toString(x));
                        int x2 = (int)(Math.random()*5);
                        la[1].setText(Integer.toString(x2));
                        int x3 = (int)(Math.random()*5);
                        la[2].setText(Integer.toString(x3));


                        if (x==x2 && x2==x3)
                            result.setText("축하합니다!!");
                        else
                            result.setText("아쉽군요");
                    }
                }
            });
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Component c = (Component)e.getSource();
                    c.requestFocus();
                }
            });
        }


    }


    public static void main(String[] args) {
        new Gambling();
    }
}
