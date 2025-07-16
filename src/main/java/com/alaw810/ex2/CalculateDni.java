package com.alaw810.ex2;

public class CalculateDni {

    private static final String LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static char calculateLetter(int dniNumber) {
        return LETTERS.charAt(dniNumber % 23);
    }
}

