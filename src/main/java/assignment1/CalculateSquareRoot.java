package assignment1;

import java.lang.Math;

public class CalculateSquareRoot implements Calculator {

    @Override
    public void calculate(int num) {

        double squareroot = Math.sqrt(num);

        System.out.println("The square root of " + num + " is " + squareroot);

    }
}
