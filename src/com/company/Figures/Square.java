package com.company.Figures;

public class Square implements Shape {
    private double sideLength;

    public double getSideLength() {
        return sideLength;
    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public  double calculateArea() {
        return Math.pow(this.sideLength, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * this.sideLength;
    }

    public double calculateDiag() {
        return this.sideLength*Math.sqrt(2);
    }
}
