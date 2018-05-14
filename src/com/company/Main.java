package com.company;
import com.company.Figures.*;
import java.util.*;
import java.util.Scanner;

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
                processCircle();
                break;
            case square:
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
        if (rectHeight <= 0 || rectWidth <=0) {
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
        System.out.println("Square's perimeter: " + square.calculatePerimeter());
        System.out.println("Square's area: " + square.calculateArea());
        System.out.println("Square's internal triangle's sides:");
        System.out.println("Sides A and B: " + side + ", Side C: " + square.calculateDiag());
    }

    private static void processCircle() {
        System.out.println("Please input circle's radius");
        double rad;
        try {
            rad = Double.parseDouble(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("input numbers idiot");
            return;
        }
        if (rad <= 0) {
            System.out.println("radius,unlike ur IQ, should be higher than zero");
            return;
        }
        Circle circle = new Circle(rad);
        System.out.println("Circle's perimeter: " + circle.calculatePerimeter());
        System.out.println("Circle's area: " + circle.calculateArea());
    }

}
