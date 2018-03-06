
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
    JTextField text1, text2;
    JLabel result1;
    JButton add,subtract, multiply, divide, copyF1, copyF2, close;
    JFrame calc;
    boolean divided = false;
    double c = 0;
    double d = 0;

    Calculator(){
        calc = new JFrame("Calculator");

        text1 = new JTextField();
        text1.setBounds(50,50,125,20);

        text2 = new JTextField();
        text2.setBounds(50,100,125,20);

        result1 = new JLabel();
        result1.setBounds(50,150,125,20);

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

        close = new JButton("Quit");
        close.setBounds(75, 425, 70, 50);

        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        copyF1.addActionListener(this);
        copyF2.addActionListener(this);
        close.addActionListener(this);

        calc.add(text1);
        calc.add(text2);
        calc.add(result1);
        calc.add(add);
        calc.add(subtract);
        calc.add(multiply);
        calc.add(divide);
        calc.add(close);
        calc.add(copyF1);
        calc.add(copyF2);
        calc.setSize(250,600);
        calc.setLayout(null);
        calc.setVisible(true);
        calc.setBackground(Color.DARK_GRAY);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setResizable(false);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = text1.getText();
        String s2 = text2.getText();

        if(e.getSource() == close) {
            calc.setVisible(false);
            calc.dispose();
            System.exit(0);
            return;
        }

        if(s1.equals("")|| s2.equals("")){
            result1.setText("Error!");
        }

        double a = Double.parseDouble(s1);
        double b = Double.parseDouble(s2);

        if(e.getSource() == add) {
            c = a + b;
            String result = String.valueOf(c);
            result1.setText(result);
            divided = false;
        }
        else if(e.getSource() == subtract) {
            c = a - b;
            String result = String.valueOf(c);
            result1.setText(result);
            divided = false;
        }
        else if(e.getSource() == multiply) {
            c = a * b;
            String result = String.valueOf(c);
            result1.setText(result);
            divided = false;
        }
        else if(e.getSource() == divide) {
            d = a / b;
            String result = String.valueOf(d);
            result1.setText(result);
            divided = true;
        }
        else if(e.getSource() == copyF1) {
            if (divided)
                text1.setText(String.valueOf(d));
            else
                text1.setText(String.valueOf(c));
        }
        else if(e.getSource() == copyF2) {
            if (divided)
                text2.setText(String.valueOf(d));
            else
                text2.setText(String.valueOf(c));
        }
        else {
            String result = String.valueOf(c);
            result1.setText(result);
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}