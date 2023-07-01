/**
 * @file GuessBirthDate1.java
 * @author Md. Yousuf Ali (yousuf.cse17@gmail.com)
 * @brief Guess birthdate || guess value 1 to 31 using five questions
 * @version 0.1
 * @date 2022-07-01
 * @since SatDay 10:10 AM
 * @copyright Copyright (c) 2022
 * @Institute: Dept. of CSE, Varendra University, Rajshahi, Bangladesh
 */
package swingPros;

import javax.swing.*;

public class GuessBirthDate1 {
    public static void main(String[] args) {

        final String setDates1 =
                "01 03 05 07\n" +
                "9 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31";

        final String setDates2 =
                "02 03 06 07\n" +
                "10 11 14 15\n" +
                "18 19 22 23\n" +
                "26 27 30 31";
        final String setDates3 =
                "04 05 06 07\n" +
                "12 13 14 15\n" +
                "20 21 22 23\n" +
                "28 29 30 31";

        final  String setDates4 =
                "08 09 10 11\n" +
                "12 13 14 15\n" +
                "24 25 26 27\n" +
                "28 29 30 31\n";

        final String setDates5 =
                "16 17 18 19\n" +
                "20 21 22 23\n" +
                "24 25 26 27\n" +
                "28 29 30 31";

        int date = 0;
        int answer = JOptionPane.showConfirmDialog(null,
                "Is Your Birthdate in These Numbers Set?\n"+setDates1);

        /*Yes -> 0, no ->1*/
        if(answer == JOptionPane.YES_OPTION){
            date += 1;
        }

        answer = JOptionPane.showConfirmDialog(null,
                "Is Your Birthdate in These Numbers Set?\n"+setDates2);

        if(answer == JOptionPane.YES_OPTION){
            date += 2;
        }

        answer = JOptionPane.showConfirmDialog(null,
                "Is Your Birthdate in These Numbers Set?\n"+setDates3);

        if(answer == JOptionPane.YES_OPTION){
            date += 4;
        }

        answer = JOptionPane.showConfirmDialog(null,
                "Is Your Birthdate in These Numbers Set?\n"+setDates4);

        if(answer == JOptionPane.YES_OPTION){
            date += 8;
        }

        answer = JOptionPane.showConfirmDialog(null,
                "Is Your Birthdate in These Numbers Set?\n"+setDates5);

        if(answer == JOptionPane.YES_OPTION){
            date += 16;
        }
        final String message = "Your birthdate is: "+date;
        JOptionPane.showMessageDialog(null, message);

    }
}
