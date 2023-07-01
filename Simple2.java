/**
 * @file Simple2.java
 * @author Md. Yousuf Ali (yousuf.cse17@gmail.com)
 * @brief Swing by association inside constructor
 * @version 0.1
 * @date 2022-06-27
 * @since TuesDay 05:18 PM
 * @copyright Copyright (c) 2022
 * @Institute: Dept. of CSE, Varendra University, Rajshahi, Bangladesh
 */
package swingPros;

import javax.swing.*;

public class Simple2 {
    JFrame jFrame;
    Simple2(){
        jFrame = new JFrame("Association inside constructor"); /*Create instance of JFrame*/
        JButton jButton = new JButton("Click"); /*Creating instance of JButton*/
        jButton.setBounds(130, 100, 100, 40);
        jFrame.add(jButton);
        jFrame.setSize(400, 500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Simple2();
    }
}
