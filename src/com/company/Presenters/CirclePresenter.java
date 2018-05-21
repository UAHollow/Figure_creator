package com.company.Presenters;
import com.company.Figures.Circle;

public class CirclePresenter {

    private static final String PERIMETER_PROMPT = "Circle's perimeter: ";
    private static final String AREA_PROMPT = "Circle's area: ";

    public static void present(Circle circle) {
        System.out.println(PERIMETER_PROMPT + circle.calculatePerimeter());
        System.out.println(AREA_PROMPT + circle.calculateArea());
    }
}
