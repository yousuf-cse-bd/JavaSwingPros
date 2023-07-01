/**
 * @file WordCounter1.java
 * @author Md. Yousuf Ali (yousuf.cse17@gmail.com)
 * @brief Word and character counters
 * @version 0.1
 * @date 2022-07-01
 * @since SatDay 10:10 AM
 * @copyright Copyright (c) 2022
 * @Institute: Dept. of CSE, Varendra University, Rajshahi, Bangladesh
 */
package swingPros;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordsCounter1 implements ActionListener {

    JLabel label1;
    JLabel label2;

    JTextArea textArea;
    JButton button;

    WordsCounter1(){
        JFrame jFrame = new JFrame("Words Counter");
        label1 = new JLabel("Words: ");
        label2 = new JLabel("Characters: ");
        label1.setBounds(50, 25, 100, 30);
        label2.setBounds(160, 25, 100, 30);

        textArea = new JTextArea();
        textArea.setBounds(20, 75, 300, 200);

        button = new JButton("Count Words");
        button.setBounds(50, 300, 120, 30);
        button.addActionListener(this);


        jFrame.add(label1);
        jFrame.add(label2);
        jFrame.add(textArea);
        jFrame.add(button);

        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setSize(450, 450);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent event){
        String text = textArea.getText();

        String [] words = text.split("\\s");

        label1.setText("Words: "+(text.isEmpty()?"0":words.length));

        label2.setText("Characters: "+text.length());
    }

    public static void main(String[] args) {
        final WordsCounter1 object = new WordsCounter1();
    }
}
