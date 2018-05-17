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
        return this.sideA + this.sideB + this.sideC;
    }

    @Override
    public  double calculateArea() {
        double perimeter = calculatePerimeter();
        double area = perimeter * (perimeter - this.sideA) * (perimeter - this.sideB) * (perimeter - this.sideC);
        return Math.sqrt(area);
    }
}
