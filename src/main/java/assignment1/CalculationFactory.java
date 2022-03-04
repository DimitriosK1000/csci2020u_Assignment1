package assignment1;

// factory class
public class CalculationFactory {

    // gets the input to decide which subclass to create
    public Calculator startCalculation(String calctype) {

        // creates and calculates the square class if "square" is inputted
        if ("square".equalsIgnoreCase(calctype)) {

            // instantiates class
            return new CalculateSquare();

        // creates and calculates the square root if "sqareroot" is inputted
        }else if ("squareroot".equalsIgnoreCase(calctype)) {

            // instantiates class
            return new CalculateSquareRoot();

        }

        return null;

    }

}
