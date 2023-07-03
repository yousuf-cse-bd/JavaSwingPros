/**
 * @file DecimalToHOB.java
 * @author Md. Yousuf Ali (yousuf.cse17@gmail.com)
 * @brief Number System: Converting Number of Bases
 * @version 0.1
 * @date 2022-07-03
 * @since MonDay 06:11 PM
 * @copyright Copyright (c) 2022
 * @Institute: Dept. of CSE, Varendra University, Rajshahi, Bangladesh
 */
package swingPros;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DecimalToHOB {

    public static String decimalToBinary(final int number){
        return Integer.toBinaryString(number);
    }

    public static String decimalToOctal(final int number){
        return Integer.toOctalString(number);
    }

    public static String decimalToHexadecimal(final int number){
        String hexDecimal = Integer.toHexString(number);
        return hexDecimal.toUpperCase();
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Decimal To Others Threes");
        JTextField textField = new JTextField(); /*Make sure input digit*/
        textField.setBounds(50,20, 200, 50);
        jFrame.add(textField);

        jFrame.setSize(400, 500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);


        JLabel binLabel = new JLabel("Binary:");
        binLabel.setBounds(50, 100, 100, 50);
        jFrame.add(binLabel);

        JLabel octalLabel = new JLabel("Octal:");
        octalLabel.setBounds(50, 150, 100, 50);
        jFrame.add(octalLabel);

        JLabel hexLabel = new JLabel("Hexadecimal:");
        hexLabel.setBounds(50, 200, 100, 50);
        jFrame.add(hexLabel);

        JButton button = new JButton("OK");
        button.setBounds(270, 20, 100, 50);
        jFrame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                /*Number format exception occur*/

                int decimalNumber = Integer.parseInt(textField.getText());
                hexLabel.setText("Hexadecimal: "+decimalToHexadecimal(decimalNumber));
                octalLabel.setText("Octal: "+decimalToOctal(decimalNumber));
                binLabel.setText("Binary: "+decimalToBinary(decimalNumber));

            }
        });

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
