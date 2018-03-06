
import javax.swing.*;
import java.awt.event.*;

public class Listener implements ActionListener, KeyListener, MouseListener{
    JButton reverse;
    JTextField first, second;
    boolean enter = false;
    boolean mouse = false;
    public Listener() {
        JFrame rev = new JFrame("Reverse");

        reverse = new JButton("reverse");
        reverse.setBounds(50,200,200,50);

        first = new JTextField();
        first.setBounds(50,50,150,20);

        second = new JTextField();
        second.setBounds(50,100,150,20);
        second.setEditable(false);

        reverse.addActionListener(this);

        first.addActionListener(this);
        first.addKeyListener(this);
        first.addMouseListener(this);

        second.addActionListener(this);

        rev.addKeyListener(this);
        rev.setFocusable(true);
        rev.add(reverse);
        rev.add(first);
        rev.add(second);
        rev.setSize(300,400);
        rev.setResizable(false);
        rev.setLayout(null);
        rev.setVisible(true);
        rev.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while(true) {
            System.out.println(mouse+ ""+" "+ enter);
            if(enter && mouse) {
                second.setText(reve());
            }
        }
    }

    public String reve() {
        String def = first.getText();
        String reversed = def;

        char[] c = reversed.toCharArray();
        char[] d = def.toCharArray();

        for(int i = 1; i <= def.length(); i++){
            d[i-1] = c[c.length - i ];
        }
        String finalReversed = new String(d);
        return finalReversed;
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == reverse) {
            second.setText(reve());
        }
    }

    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == 10) {
            enter = true;
        }
    }

    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == 10) {
            enter = false;
        }
    }

    public void mouseEntered(MouseEvent e) {
        mouse = true;
    }

    public void mouseExited(MouseEvent e) {
        mouse = false;

    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void keyTyped(KeyEvent e) {

    }

    public static void main(String args[]) {
        new Listener();
    }
}
