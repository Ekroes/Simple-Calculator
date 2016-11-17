/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.*;

/**
 *
 * @author BA202
 */
public class Validator_Class {

    public static boolean IsPresentDouble(JTextField value, String Name) {

        try {
            // if you can successfully parse your text, return true - they entered a valid number
            double d = Double.parseDouble(value.getText());

            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(value,
                    "Invalid input.\n" + Name + " requires a numeric input. \nTry again...",
                    Name, JOptionPane.ERROR_MESSAGE);
            value.requestFocusInWindow();
            value.selectAll();
            return false;
        }

    }

    public static boolean IsPresentOperator(JTextField Sign, String Name) {

        if ((Sign.getText().equals("")) || Sign.getText() == null) {
            JOptionPane.showMessageDialog(Sign, "No Operator detected"
                    + "\nTry again.",
                    Name, JOptionPane.ERROR_MESSAGE);
            Sign.requestFocusInWindow();
            Sign.selectAll();
            return false;

        } else {
            return true;
        }

    }

    public static double IsDecimal(JTextField Operand, String Name) {
        //since double is a requirement of the first validation this just transforms string to numeric value

        double d = 0;

        d = Double.parseDouble(Operand.getText());

        return d;

    }

    public static String IsOperator(JTextField Operator, String Name) throws Exception {

        if ((Operator.getText().equals("+") || (Operator.getText().equals("-")
                || (Operator.getText().equals("*")) || (Operator.getText().equals("/"))))) {

            return Operator.getText();
        } else {
            JOptionPane.showMessageDialog(Operator, "Invalid Operator detected"
                    + "\nTry again.",
                    Name, JOptionPane.ERROR_MESSAGE);
        }
        Operator.requestFocusInWindow();
        Operator.selectAll();
        return "";
    }

    public static boolean WithinRange(double Operand, String Name) throws Exception {

        if (Operand >= 0 && Operand < 1000000) {
            return true;
        } else {
            throw new Exception(Name + " must be between 0 and 1,000,000");
        }

    }

}
