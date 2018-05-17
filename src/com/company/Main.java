package com.company;
import com.company.Figures.*;
import java.util.*;
import java.util.Scanner;
import com.company.Builders.*;
import com.company.Presentors.CirclePresenter;
import com.company.Presentors.SquarePresenter;


public class Main {
    enum shapesList { circle, square, rectangle, triangle }
    private static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        System.out.println("choose a figure from available list of:" + Arrays.toString(shapesList.values()));
        shapesList shape;

        try {
             shape = shapesList.valueOf(scanner.nextLine().toLowerCase().trim());
        } catch (IllegalArgumentException e) {
            System.out.println("choose one of the figures from the list would you kindly");
            return;
        } catch (NullPointerException e) {
            System.out.println("input something baka");
            return;
        }

        switch (shape) {
            case circle:
                Circle circle = new CircleBuilder().buildFigure();
                CirclePresenter.present(circle);
                break;
            case square:
                Square square = new SquareBuilder().buildFigure();
                SquarePresenter.present(square);
                processSquare();
                break;
            case rectangle:
                processRectangle();
                break;
            case triangle:
                processTriangle();
                break;
        }
    }

    private static void processTriangle() {
        System.out.println("Please input triangle's side legths below:");
        double sideA, sideB, sideC;
        try {
            sideA = Double.parseDouble(scanner.nextLine().trim());
            sideB = Double.parseDouble(scanner.nextLine().trim());
            sideC = Double.parseDouble(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("input numbers idiot");
            return;
        }
        if (sideA <= 0 || sideB <=0 || sideC <= 0) {
            System.out.println("length,unlike ur IQ, should be higher than zero");
            return;
        }
        if ((sideA >= (sideB + sideC)) || (sideB >= (sideA + sideC)) || (sideC >= (sideA + sideB))){
            System.out.println("this aint a triangle no more, dude, try again");
            return;
        }
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        System.out.println("Triangle's perimeter: " + triangle.calculatePerimeter());
        System.out.println("Triangle's area: " + triangle.calculateArea());
    }

    private static void processRectangle() {
        System.out.println("Please input rectangle's height:");
        double rectHeight, rectWidth;
        try {
            rectHeight = Double.parseDouble(scanner.nextLine().trim());
            rectWidth = Double.parseDouble(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("input numbers idiot");
            return;
        }
        if (rectHeight <= 0 || rectWidth <= 0) {
            System.out.println("height and width,unlike ur IQ, should be higher than zero");
            return;
        }
        Rectangle rectangle = new Rectangle(rectHeight, rectWidth);
        System.out.println("Rectangle's perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Rectangle's area: " + rectangle.calculateArea());
        System.out.println("Rectangle's internal triangle's sides:");
        System.out.println("Side A: " + rectHeight + ", Side B " + rectWidth + ", Side C" + rectangle.calculateDiag());
    }

    private static void processSquare() {
        System.out.println("Please input square's length of side");
        double side;
        try {
            side = Math.abs(Double.parseDouble(scanner.nextLine().trim()));
        } catch (NumberFormatException e) {
            System.out.println("input numbers idiot");
            return;
        }
        Square square = new Square(side);

    }

}
