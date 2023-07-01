/**
 * @file SimpleButton1.java
 * @author Md. Yousuf Ali (yousuf.cse17@gmail.com)
 * @brief Swing java JButton example
 * @version 0.1
 * @date 2022-06-27
 * @since TuesDay 05:18 PM
 * @copyright Copyright (c) 2022
 * @Institute: Dept. of CSE, Varendra University, Rajshahi, Bangladesh
 */
package swingPros;

import javax.swing.*;

public class SimpleButton1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Simple Button Example");
        JButton jButton = new JButton("Click Here");
        jButton.setBounds(50, 100, 100, 30);
        jFrame.add(jButton);
        jFrame.setSize(400, 500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
