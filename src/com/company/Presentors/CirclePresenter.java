package com.company.Presentors;
import com.company.Figures.Circle;

public class CirclePresenter {
    public static void present(Circle circle) {
        System.out.println("Circle's perimeter: " + circle.calculatePerimeter());
        System.out.println("Circle's area: " + circle.calculateArea());
    }
}
