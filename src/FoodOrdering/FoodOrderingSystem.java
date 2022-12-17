package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderingSystem() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                orders();
            }
        });
    }

    public void orders(){
        double currT = 0;
        double res = 0;
        if (cPizza.isSelected()) {
            currT += 100;
        }
        if (cBurger.isSelected()){
            currT += 80;
        }
        if (cFries.isSelected()){
            currT += 65;
        }
        if (cSoftDrinks.isSelected()){
            currT += 55;
        }
        if (cTea.isSelected()){
            currT += 50;
        }
        if (cSundae.isSelected()){
            currT += 40;
        }
        if (rbNone.isSelected()){
            currT = currT;
        }
        if (rb5.isSelected()) {
            res = currT * 0.05;
            currT = currT -  res;
        }
        if (rb10.isSelected()){
            res =  currT * 0.10;
            currT = currT - res;
        }
        if (rb15.isSelected()){
            res = currT * 0.15;
            currT = currT - res;
        }
        JOptionPane.showMessageDialog(panel1, "The total price is Php " + String.format("%.2f", currT));
    }

    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setContentPane(app.panel1);
        app.setSize(600, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Food Ordering System");
    }
}
