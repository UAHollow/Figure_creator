package com.company.Builders;

import com.company.Figures.Rectangle;

public class RectangleBuilder extends AbstractShapeBuilder implements ShapeBuilder {

    private static final String SQUARE_PROMPT = "Please input rectangle's height and width in order";

    @Override
    public Rectangle buildFigure() {
        System.out.println(SQUARE_PROMPT);
        double height = super.getLength(), width = super.getLength();
        return new Rectangle(height, width);
    }
}
