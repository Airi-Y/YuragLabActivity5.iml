package SimpleCalc;

import LeapYear.LeapYearChecker;

import javax.swing.*;

public class SimpleCalculator extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JButton computeResultButton;

    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.panel1);
        app.setSize(600, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
