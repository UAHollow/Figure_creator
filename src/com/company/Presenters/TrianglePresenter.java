package com.company.Presenters;

import com.company.Figures.Triangle;

public class TrianglePresenter {

    private static final String PERIMETER_PROMPT = "Triangle's perimeter: ";
    private static final String AREA_PROMPT = "Triangle's area: ";

    public static void present(Triangle triangle) {
        System.out.println(PERIMETER_PROMPT + triangle.calculatePerimeter());
        System.out.println(AREA_PROMPT + triangle.calculateArea());
    }
}
