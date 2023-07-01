/**
 * @file SimpleSwing.java
 * @author Md. Yousuf Ali (yousuf.cse17@gmail.com)
 * @brief Simple java swing example
 * @version 0.1
 * @date 2022-06-27
 * @since TuesDay 05:18 PM
 * @copyright Copyright (c) 2022
 * @Institute: Dept. of CSE, Varendra University, Rajshahi, Bangladesh
 */
package swingPros;

import javax.swing.*;

public class SimpleSwing {
    public static void main(String[] args) {
        /*Creating an instance for frame*/
        JFrame jFrame = new JFrame();
        /*Creating an instance for button*/
        JButton jButton = new JButton("Click Me!");

        jButton.setBounds(200, 50, 100, 30);

        /*Add the button on frame*/
        jFrame.add(jButton);
        jFrame.setSize(500, 600);
        jFrame.setLayout(null); /*Using null layout*/
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
