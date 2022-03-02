package assignment1;

import java.lang.Math;

public class CalculateSquare implements Calculator {

    @Override
    public void calculate(int num) {

        double squared = Math.pow(num, 2);

        System.out.println("The square of " + num + " is " + squared);

    }
}
