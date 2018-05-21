package com.company.Presenters;
import com.company.Figures.Square;

public class SquarePresenter {

    private static final String PERIMETER_PROMPT = "Square's perimeter: ";
    private static final String AREA_PROMPT = "Square's area: ";
    private static final String INTERNAL_TRIANGLE_PROMPT = "Square's internal triangle's sides:";
    private static final String SIDES_A_B_AND_C = "Sides A and B: %s, Side C: %s";

    public static void present(Square square) {
        System.out.println(PERIMETER_PROMPT + square.calculatePerimeter());
        System.out.println(AREA_PROMPT + square.calculateArea());
        System.out.println(INTERNAL_TRIANGLE_PROMPT);
        System.out.println(String.format(SIDES_A_B_AND_C, square.getSideLength(), square.calculateDiag()));
    }
}
