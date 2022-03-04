package assignment1;

import java.util.Scanner;

public class CalculationMainClass {

    public static void main(String[] args) {

        // gets input
        Scanner scan = new Scanner(System.in);
        int calcnum = scan.nextInt();
        scan.close();

        // creates new object CalculationFactory
        CalculationFactory calculationFactory = new CalculationFactory();

        // uses factory to choose which subclass to instantiate
        Calculator calculate_square = calculationFactory.startCalculation("square");
        Calculator calculate_squareroot = calculationFactory.startCalculation("squareroot");

        // calls the methods
        calculate_square.calculate(calcnum);
        calculate_squareroot.calculate(calcnum);

    }

}
