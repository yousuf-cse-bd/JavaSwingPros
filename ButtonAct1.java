/**
 * @file ButtonAct1.java
 * @author Md. Yousuf Ali (yousuf.cse17@gmail.com)
 * @brief Java JButton example with ActionListener
 * @version 0.1
 * @date 2022-06-27
 * @since TuesDay 05:18 PM
 * @copyright Copyright (c) 2022
 * @Institute: Dept. of CSE, Varendra University, Rajshahi, Bangladesh
 */
package swingPros;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAct1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Button with Action Listener");
        final JTextField jTextField = new JTextField();
        jTextField.setBounds(50, 50, 150, 20);

        JButton jButton = new JButton("Click Here");
        jButton.setBounds(50, 100,  100, 30);

        final String text = "Welcome to JavaTPoint";

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(text);
            }
        });

        jFrame.add(jTextField);
        jFrame.add(jButton);
        jFrame.setSize(400, 500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
