package com.company.Builders;

import com.company.Figures.Triangle;
import com.company.Validators.TriangleValidator;

public class TriangleBuilder extends AbstractShapeBuilder implements ShapeBuilder   {

    private static final String TRIANGLE_PROMPT = "Please input triangle's side lengths";

    @Override
    public Triangle buildFigure() {
        System.out.println(TRIANGLE_PROMPT);
        boolean figureIsTriangle = false;
        double sideA = 0, sideB = 0, sideC = 0;
        while (!figureIsTriangle) {
            sideA = super.getLength();
            sideB = super.getLength();
            sideC = super.getLength();
            String errorMessage = TriangleValidator.validateTriangle(sideA, sideB, sideC);
            if (errorMessage != null) {
                System.out.println(errorMessage);
            } else {
                figureIsTriangle = true;
            }
        }
        return new Triangle(sideA, sideB, sideC);
    }
}
