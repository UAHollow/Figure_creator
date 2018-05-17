package com.company.Validators;

public class CommonValidator {

    public static String validateCircleParams(double rad) {
        if (rad <= 0) {
            return "radius, unlike ur IQ, should be higher than zero";
        } else {
            return null;
        }
    }
}
