package com.company.Figures;

public class Triangle implements Shape {
    private double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public  double calculateArea() {
        double perimeter = calculatePerimeter();
        double area = perimeter*(perimeter - sideA)*(perimeter - sideB)*(perimeter - sideC);
        return Math.sqrt(area);
    }
}
