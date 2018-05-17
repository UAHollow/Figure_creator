package com.company.Builders;

import com.company.Figures.Circle;

public class CircleBuilder extends AbstractShapeBuilder implements ShapeBuilder {


    private static final String RADIUS_PROMPT = "Please input circle's radius length";

    @Override
    public Circle buildFigure() {
        System.out.println(RADIUS_PROMPT);
        double radius = super.getLength();
        return new Circle (radius);
    }
}
