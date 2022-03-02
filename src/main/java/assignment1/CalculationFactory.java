package assignment1;

public class CalculationFactory {

    public Calculator startCalculation(String calctype) {

        if ("square".equalsIgnoreCase(calctype)) {

            return new CalculateSquare();

        }else if ("squareroot".equalsIgnoreCase(calctype)) {

            return new CalculateSquareRoot();

        }

        return null;

    }

}
