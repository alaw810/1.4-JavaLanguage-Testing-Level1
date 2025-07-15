package com.alaw810.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryManagerTest {

    @Test
    void libraryShouldNotBeNullAfterInitialization() {
        LibraryManager library = new LibraryManager();
        assertNotNull(library.getLibrary());

    }
}
