package com.company.Builders;
import com.company.Figures.Circle;
import com.company.Validators.CommonValidator;

import java.util.Scanner;

public class CircleBuilder {

    private static final String NUMBER_INPUT_ERROR = "Input numbers idiot";
    private static final String RADIUS_PROMPT = "Please input circle's radius";

    public static Circle buildFigure() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(RADIUS_PROMPT);
        boolean inputIsCorrect = false;
        double radius = 0;
        while (!inputIsCorrect) {
            try {
                radius = Double.parseDouble(scanner.nextLine().trim());
                String errorMessage = CommonValidator.validateCircleParams(radius);
                if (errorMessage != null) {
                    System.out.println(errorMessage);
                } else {
                    inputIsCorrect = true;
                }
            } catch (NumberFormatException e) {
                System.out.println(NUMBER_INPUT_ERROR);
            }
        }
        return new Circle(radius);
    }
}
