package FoodOrdering;

import SimpleCalc.SimpleCalculator;

import javax.swing.*;

public class FoodOrderingSystem extends JFrame{
    private JPanel panel1;
    private JCheckBox pizzaCheckBox;
    private JRadioButton noneRadioButton;
    private JButton orderButton;

    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setContentPane(app.panel1);
        app.setSize(600, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
