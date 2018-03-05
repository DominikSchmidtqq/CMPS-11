/**
 * Created by domin on 3/5/2018.
 */
import javax.swing.*;
public class Calculator {
    public static void main(String args[]) {
        JFrame calc = new JFrame("Calculator");
        calc.setSize(400,300);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pCalc = new JPanel();
        calc.add(pCalc);
        addComponents(pCalc);

        calc.setVisible(true);
    }
    private static void addComponents(JPanel pCalc) {
        JLabel field1 = new JLabel("F1");
        field1.setBounds(50,50,20,20);
        pCalc.add(field1);

        JTextField field1text = new JTextField(5);
        field1text.setBounds(50,60,20,20);
        pCalc.add(field1text);
    }
}
