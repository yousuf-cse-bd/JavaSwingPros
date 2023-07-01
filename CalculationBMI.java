/**
 * @file CalculationBMI.java
 * @author Md. Yousuf Ali (yousuf.cse17@gmail.com)
 * @brief Simple GUI BMI calculation
 * @version 0.1
 * @date 2022-07-01
 * @since SatDay 10:10 AM
 * @copyright Copyright (c) 2022
 * @Institute: Dept. of CSE, Varendra University, Rajshahi, Bangladesh
 */
package swingPros;

import javax.swing.*;

/**
 * BMI = weight/(height*height)
 */
public class CalculationBMI {
    static double feet2Meter(final double heightInFeet){
        final double heightInMeter = heightInFeet * 0.3048;
        return heightInMeter;
    }
    public static void main(String[] args) {
        double weightInKgs = 0.0;
        double heightInFeet = 0.0;

        weightInKgs = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Weight[KGs]"));
        weightInKgs = Math.abs(weightInKgs);

        heightInFeet = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height[Feet]"));
        heightInFeet = Math.abs(heightInFeet);

        final double heightInMeter = feet2Meter(heightInFeet);

        final double bmiValue = weightInKgs/Math.pow(heightInMeter, 2);
        final String message = "Your BMI value: " + bmiValue;

        JOptionPane.showMessageDialog(null,message);
    }
}
