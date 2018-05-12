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
            System.out.println("input smthing baka");
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
        System.out.println("Please input triangle's length of sides");
        double[] triSides = new double[3];
        for (int i = 0;i < triSides.length; i++) {
                try {
                    triSides[i] = Math.abs(Double.parseDouble(scanner.nextLine().trim()));
                } catch (NumberFormatException e) {
                    System.out.println("input numbers idiot");
                    return;
                }
           /* if (triSides[i] <= 0) {
                System.out.println("numbers,unlike ur IQ, should be higher than zero");
                return;
            }*/
        }
        Triangle triangle = new Triangle(triSides);
        System.out.println("Triangle's perimeter: " + triangle.calculatePerimeter());
        System.out.println("Triangle's area: " + triangle.calculateArea());
    }

    private static void processRectangle() {
        System.out.println("Please input rectangle's length of 2 sides");
        double[] rectSides = new double[2];
        for (int i = 0;i < rectSides.length; i++) {
            try {
                rectSides[i] = Math.abs(Double.parseDouble(scanner.nextLine().trim()));
            } catch (NumberFormatException e) {
                System.out.println("input numbers idiot");
                return;
            }
          /*  if (rectSides[i] <= 0) {
                System.out.println("numbers,unlike ur IQ, should be higher than zero");
                return;
            }*/
        }
        Rectangle rectangle = new Rectangle(rectSides);
        System.out.println("Rectangle's perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Rectangle's area: " + rectangle.calculateArea());
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
    }

    private static void processCircle() {
        System.out.println("Please input circle's radius");
        double rad;
        try {
            rad = Math.abs(Double.parseDouble(scanner.nextLine().trim()));
        } catch (NumberFormatException e) {
            System.out.println("input numbers idiot");
            return;
        }
        Circle circle = new Circle(rad);
        System.out.println("Circle's perimeter: " + circle.calculatePerimeter());
        System.out.println("Circle's area: " + circle.calculateArea());
    }

}
