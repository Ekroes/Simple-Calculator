/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author BA202
 */
public class Calculator_Back {

    public static double Calculate(double op1, String function, double op2) throws Exception {

        if (function.equals("+")) {

            return op1 + op2;
        } else if (function.equals("-")) {

            return op1 - op2;
        } else if (function.equals("*")) {

            return op1 * op2;
        } else if (function.equals("/")) {

            if (op2 == 0) {

                throw new Exception("You cannot divide by zero");

            } else {
                return op1 / op2;
            }
        } else {

            throw new Exception("");

        }

    }

}
