package com.company.Figures;

public class Square implements Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
    @Override
    public  double calculateArea() {
        return Math.pow(sideLength, 2);
    }
    @Override
    public double calculatePerimeter() {
        return 4 * sideLength;
    }

    public double calculateDiag() {
        return sideLength*Math.sqrt(2);
    }
}
