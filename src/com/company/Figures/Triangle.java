package com.company.Figures;

public class Triangle implements Shape {
    private double[] sideLengths;

    public Triangle(double[] sideLengths){
        this.sideLengths = sideLengths;
    }

    @Override
    public double calculatePerimeter(){
        float perimeter = 0;
        for (double sides : sideLengths) {
            perimeter += sides;
        }
        return (perimeter);
    }

    @Override
    public  double calculateArea(){
        double perimeter = calculatePerimeter();
        double[] areaParts = new double[3];
        double area = perimeter;
        for (int i = 0; i < areaParts.length; i++) {
            areaParts[i] = (perimeter - sideLengths[i]);
            area *= areaParts[i];
        }
        return (Math.sqrt(area));
    }
}
