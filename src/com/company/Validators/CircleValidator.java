package com.company.Validators;

public class CircleValidator {
    public static double validate(double rad){
        if (rad <= 0) {
            System.out.println("radius,unlike ur IQ, should be higher than zero");
            return 0;
        }else {return rad;}
    }
}
