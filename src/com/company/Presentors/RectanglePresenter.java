package com.company.Presentors;

import com.company.Figures.Rectangle;

public class RectanglePresenter {
    private static final String PERIMETER_PROMPT = "Rectangle's perimeter: ";
    private static final String AREA_PROMPT = "Rectangle's area: ";
    private static final String INTERNAL_TRIANGLE_PROMPT = "Rectangle's internal triangle's sides:";
    private static final String SIDES_A_B_AND_C = "Side A: %s, Side B: %s,  Side C: %s";

    public static void present(Rectangle rectangle) {
        System.out.println(PERIMETER_PROMPT + rectangle.calculatePerimeter());
        System.out.println(AREA_PROMPT + rectangle.calculateArea());
        System.out.println(INTERNAL_TRIANGLE_PROMPT);
        System.out.println(String.format(SIDES_A_B_AND_C, rectangle.getHeight(), rectangle.getWidth(), rectangle.calculateDiag()));
    }
}

