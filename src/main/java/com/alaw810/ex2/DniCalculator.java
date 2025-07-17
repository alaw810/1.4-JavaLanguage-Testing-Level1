package com.alaw810.ex2;

public class DniCalculator {

    private static final String LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static char calculateLetter(int dniNumber) {
        if (dniNumber < 0 || dniNumber > 99999999) {
            throw new IllegalArgumentException("DNI number must be between 0 and 99,999,999.");
        }
        return LETTERS.charAt(dniNumber % 23);
    }
}

