
import javax.swing.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
    JTextField text1, text2;
    JLabel result1;

    JButton add,subtract, multiply, divide, copyF1, copyF2;
    Calculator(){
        JFrame calc = new JFrame("Calculator");

        text1 = new JTextField();
        text1.setBounds(50,50,150,20);

        text2 = new JTextField();
        text2.setBounds(50,100,150,20);

        result1 = new JLabel();
        result1.setBounds(50,150,150,20);

        add = new JButton("+");
        add.setBounds(50,200,50,50);

        subtract = new JButton("-");
        subtract.setBounds(120,200,50,50);

        multiply = new JButton("*");
        multiply.setBounds(50, 275, 50,50);

        divide = new JButton("/");
        divide.setBounds(120, 275, 50,50);

        copyF1 = new JButton("F1");
        copyF1.setBounds(50, 350, 50,50);

        copyF2 = new JButton("F2");
        copyF2.setBounds(120, 350,50,50);

        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);

        calc.add(text1);
        calc.add(text2);
        calc.add(result1);
        calc.add(add);
        calc.add(subtract);
        calc.add(multiply);
        calc.add(divide);
        calc.add(copyF1);
        calc.add(copyF2);
        calc.setSize(300,500);
        calc.setLayout(null);
        calc.setVisible(true);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = text1.getText();
        String s2 = text2.getText();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        boolean divided = false;
        double d = 0;

        if(s1.equals("")|| s2.equals("")){
            result1.setText("Error!");
        }
        if(e.getSource() == add) {
            c = a + b;
            String result = String.valueOf(c);
            result1.setText(result);
        }
        else if(e.getSource() == subtract) {
            c = a - b;
            String result = String.valueOf(c);
            result1.setText(result);
        }
        else if(e.getSource() == multiply) {
            c = a * b;
            String result = String.valueOf(c);
            result1.setText(result);
        }
        else if(e.getSource() == divide) {
            d = (double)a / (double)b;
            String result = String.valueOf(d);
            result1.setText(result);
            divided = true;
        }
        else {
            String result = String.valueOf(c);
            result1.setText(result);
        }
        if(e.getSource() == copyF1) {
            if(divided)
                text1.setText(String.valueOf(d));
            else
                text1.setText(String.valueOf(c));
        }
        else if(e.getSource() == copyF2) {
            if(divided)
                text2.setText(String.valueOf(d));
            else
                text2.setText(String.valueOf(c));
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}