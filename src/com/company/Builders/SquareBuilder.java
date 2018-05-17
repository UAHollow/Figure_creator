package com.company.Builders;
import com.company.Figures.Square;
import com.company.Validators.GreaterThanZeroValidator;
import java.util.Scanner;

public class SquareBuilder implements ShapeBuilder {

    private static final String NUMBER_INPUT_ERROR = "Input numbers idiot";
    private static final String SQUARE_PROMPT = "Please input square's side length";

    @Override
    public Square buildFigure() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(SQUARE_PROMPT);
        boolean inputIsCorrect = false;
        double sideLength = 0;
        while (!inputIsCorrect) {
            try {
                sideLength = Double.parseDouble(scanner.nextLine().trim());
                String errorMessage = GreaterThanZeroValidator.validateParam(sideLength);
                if (errorMessage != null) {
                    System.out.println(errorMessage);
                } else {
                    inputIsCorrect = true;
                }
            } catch (NumberFormatException e) {
                System.out.println(NUMBER_INPUT_ERROR);
            }
        }
        return new Square(sideLength);
    }
}
