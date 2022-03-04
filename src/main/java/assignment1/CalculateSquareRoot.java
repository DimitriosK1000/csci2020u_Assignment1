package assignment1;

import java.lang.Math;

// calculate square root class
public class CalculateSquareRoot implements Calculator {

    // overrides main function and takes the inputted number
    @Override
    public void calculate(int num) {

        // calculates the square root of the given number
        double squareroot = Math.sqrt(num);

        // output
        System.out.println("The square root of " + num + " is " + squareroot);

    }

}
