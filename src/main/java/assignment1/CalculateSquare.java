package assignment1;

import java.lang.Math;

// square calculator class
public class CalculateSquare implements Calculator {

    // overrides main function and takes the inputted number from main method
    @Override
    public void calculate(int num) {

        // calculates the square of the given number
        double squared = Math.pow(num, 2);

        // output
        System.out.println("The square of " + num + " is " + squared);

    }

}
