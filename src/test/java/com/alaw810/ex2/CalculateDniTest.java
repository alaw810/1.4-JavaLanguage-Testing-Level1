package com.alaw810.ex2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateDniTest {

    static Stream<Arguments> dniDataProvider() {
        return Stream.of(
                Arguments.of(12345678, 'Z'),
                Arguments.of(38294375, 'L'),
                Arguments.of(99100299, 'S'),
                Arguments.of(12003812, 'C'),
                Arguments.of(00000000, 'T'),
                Arguments.of(48381288, 'Y'),
                Arguments.of(76612372, 'Q'),
                Arguments.of(91274123, 'A'),
                Arguments.of(32993623, 'P'),
                Arguments.of(77123882, 'Y')
        );
    }


    @ParameterizedTest
    @MethodSource("dniDataProvider")
    void testCalculateDniLetter(int dni, char expectedLetter) {
        char result = CalculateDni.calculateLetter(dni);
        assertEquals(expectedLetter, result);
    }

}
