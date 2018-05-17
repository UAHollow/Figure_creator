package com.company.Builders;

import com.company.Figures.Square;


public class SquareBuilder extends AbstractShapeBuilder implements ShapeBuilder {

    private static final String SQUARE_PROMPT = "Please input square's side length";

    @Override
    public Square buildFigure() {
        System.out.println(SQUARE_PROMPT);
        double sideLength = super.getLength();
        return new Square(sideLength);
    }
}
