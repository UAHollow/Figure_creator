package com.company.Figures;

public class Rectangle implements Shape {
    private double[] sideLengths;

    public Rectangle(double[] sideLengths) {
        this.sideLengths = sideLengths;
    }

    @Override
    public  double calculateArea() {
        return (sideLengths[0]*sideLengths[1]);
    }

    @Override
    public double calculatePerimeter() {
        return (2*(sideLengths[0]+sideLengths[1]));
    }
}
