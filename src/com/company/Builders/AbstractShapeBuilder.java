package com.company.Builders;

import com.company.Validators.GreaterThanZeroValidator;

import java.util.Scanner;

class AbstractShapeBuilder {
    private static final String NUMBER_INPUT_ERROR = "Input numbers idiot";

    double getLength() {
        Scanner scanner = new Scanner(System.in);
        double length = 0;
        boolean inputIsCorrect = false;
        while (!inputIsCorrect) {
            try {
                length = Double.parseDouble(scanner.nextLine().trim());
                String errorMessage = GreaterThanZeroValidator.validateParam(length);
                if (errorMessage != null) {
                    System.out.println(errorMessage);
                } else {
                    inputIsCorrect = true;
                }
            } catch (NumberFormatException e) {
                System.out.println(NUMBER_INPUT_ERROR);
            }
        }
        return length;
    }
}
