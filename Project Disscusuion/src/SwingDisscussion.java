import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDisscussion implements ActionListener {

    JFrame jframe;
    JButton jButton,jButton2;

    SwingDisscussion() {
        jframe = new JFrame("Java Swing Session");
        jframe.setLayout(null);
        jframe.setVisible(true);
        jframe.setBackground(Color.red);
        jframe.setSize(700,400);

        jButton = new JButton("Click_mE!!!");
        jButton.setSize(100,50);
        jframe.add(jButton);
        jButton.addActionListener(this);

        jButton2 = new JButton("btn2");
        jButton2.setSize(100,50);
        jButton2.setLocation(200,0);
        jButton2.addActionListener(this);

        jframe.add(jButton2);

        jframe.getContentPane().setBackground(Color.green);
    }

    public static void main(String[] args)
    {
        SwingDisscussion swingDiss = new SwingDisscussion();
    }
    boolean click=false;
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if(s.equals("Click_mE!!!"))
        {
            if(click)
            {
                jframe.getContentPane().setBackground(Color.black);
                click = false;
            }
            else {
                Color c1 = new Color(94, 131, 243);
                jframe.getContentPane().setBackground(c1);
                click = true;
            }
        }
        if(s.equals("btn2")) {
            jframe.getContentPane().setBackground(Color.pink);
        }

    }
}
