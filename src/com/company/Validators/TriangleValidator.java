package com.company.Validators;

public class TriangleValidator {
    public static String validateTriangle(double sideA, double sideB, double sideC){
        if ((sideA >= (sideB + sideC)) || (sideB >= (sideA + sideC)) || (sideC >= (sideA + sideB))){
            return "this aint a triangle no more, dude, try again";
        } else return null;
    }
}
