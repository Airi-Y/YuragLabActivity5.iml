package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalculator(){

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OpCompute();
            }
        });
    }

    public void OpCompute(){
        try{
        String op = (String) cbOperations.getSelectedItem();
        double n1 = Double.parseDouble(tfNumber1.getText());
        double n2 = Double.parseDouble(tfNumber2.getText());
        double res = 0;
        if (op == "+") {
            res = n1 + n2;
            lblResult.setText(String.valueOf(String.format("%.0f", (res))));
        }
        if (op == "-"){
            res = n1 - n2;
            lblResult.setText(String.valueOf(String.format("%.0f", (res))));
        }
        if (op == "*"){
            res = n1 * n2;
            lblResult.setText(String.valueOf(String.format("%.0f", (res))));
        }
        if (op == "/"){
            res = n1 / n2;
            lblResult.setText(String.valueOf(String.format("%.0f", (res))));
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.panel1);
        app.setSize(600, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple Calculator");
    }

}
