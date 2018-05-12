package com.company.Figures;


public class Circle implements Shape {
    private float radius;

    public Circle(float radius){
        this.radius = radius;
    }

    @Override
    public  double calculateArea(){
        return (Math.PI*radius*radius);
    }
    @Override
    public double calculatePerimeter(){
        return (Math.PI*2*radius);
    }
}
