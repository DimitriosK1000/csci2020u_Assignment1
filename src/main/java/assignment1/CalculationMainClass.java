package assignment1;

import java.util.Scanner;

public class CalculationMainClass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int calcnum = scan.nextInt();
        scan.close();

        CalculationFactory calculationFactory = new CalculationFactory();

        Calculator calculate_square = calculationFactory.startCalculation("square");
        Calculator calculate_squareroot = calculationFactory.startCalculation("squareroot");

        calculate_square.calculate(calcnum);
        calculate_squareroot.calculate(calcnum);

    }

}
