package com.company.Presentors;
import com.company.Figures.Circle;
import com.company.Figures.Square;

public class SquarePresenter {

    private static final String PERIMETER_PROMPT = "Square's perimeter: ";
    private static final String AREA_PROMPT = "Square's area: ";
    private static final String INTERNAL_TRIANGLE_PROMPT = "Square's internal triangle's sides:";
    private static final String SIDES_A_AND_B_PROMPT = "Sides A and B: ";
    private static final String SIDE_C_PROMPT = ", Side C: ";

    public static void present(Square square) {
        System.out.println(PERIMETER_PROMPT + square.calculatePerimeter());
        System.out.println(AREA_PROMPT + square.calculateArea());
        System.out.println(INTERNAL_TRIANGLE_PROMPT);
        System.out.println(SIDES_A_AND_B_PROMPT + square.getSideLength() + SIDE_C_PROMPT + square.calculateDiag());
        String.format("%s", square.getSideLength());
    }
}
