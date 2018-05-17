package com.company.Validators;

public class GreaterThanZeroValidator {

    private static final String LOWER_THAN_ZERO_ERROR = "length, unlike ur IQ, should be higher than zero";

    public static String validateParam(double param) {
        if (param <= 0) {
            return LOWER_THAN_ZERO_ERROR;
        } else {
            return null;
        }
    }
}
