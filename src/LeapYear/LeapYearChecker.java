package LeapYear;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearChecker() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkYear();
            }
        });
    }

        public void checkYear() {
            try {
                if (tfYear.getText() == " ") {
                    throw new IllegalArgumentException("Empty String!");
                }
                double yr = Double.parseDouble(tfYear.getText());
                boolean leap;

                if (yr < 0) {
                    throw new IllegalArgumentException("Input is invalid!");
                }
                if (yr % 4 == 0) {
                    if (yr % 100 == 0) {
                        leap = yr % 400 == 0;
                    } else {
                        leap = true;
                    }
                } else {
                    leap = false;
                }

                if (leap) {
                    JOptionPane.showMessageDialog(panel1, "Leap Year");
                } else {
                    JOptionPane.showMessageDialog(panel1, "Not a Leap Year");
                }
                tfYear.setText("");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                tfYear.setText("");}
    }

            public static void main(String[] args) {
        LeapYearChecker app = new LeapYearChecker();
        app.setContentPane(app.panel1);
        app.setSize(350, 350);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");
    }
}
