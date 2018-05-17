package com.company.Builders;
import com.company.Figures.Circle;

import java.util.Scanner;

public class CircleBuilder {

    public double getRad(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input circle's radius");
        try {
            return Double.parseDouble(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("input numbers idiot");
            return Double.parseDouble(scanner.nextLine().trim());
        }
    }
    public Circle buildFigure(double rad){
        return new Circle(rad);
    }
}
