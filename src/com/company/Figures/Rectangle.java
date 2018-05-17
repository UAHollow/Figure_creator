package com.company.Figures;

public class Rectangle implements Shape {
    private double height, width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public  double calculateArea() {
        return height * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (height + width);
    }

    public double calculateDiag() {
        return Math.sqrt((height*height) + (width*width));
    }
}
