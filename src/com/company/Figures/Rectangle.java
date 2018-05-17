package com.company.Figures;

public class Rectangle implements Shape {
    private double height, width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public  double calculateArea() {
        return this.height * this.width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * this.height + this.width;
    }

    public double calculateDiag() {
        return Math.sqrt((this.height*this.height) + (this.width*this.width));
    }
}
