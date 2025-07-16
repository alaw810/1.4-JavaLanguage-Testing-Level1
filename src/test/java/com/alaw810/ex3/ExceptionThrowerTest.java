package com.alaw810.ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

class ExceptionThrowerTest {

    @Test
    void shouldThrowArrayIndexOutOfBoundsException() {
        ExceptionThrower thrower = new ExceptionThrower();

        try {
            thrower.triggerException();
            fail("Expected ArrayIndexOutOfBoundsException was not thrown");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }


}
