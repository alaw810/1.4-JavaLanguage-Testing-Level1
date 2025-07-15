package com.alaw810.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryManagerTest {

    @Test
    void libraryShouldNotBeNullAfterInitialization() {
        LibraryManager library = new LibraryManager();
        assertNotNull(library.getLibrary());

    }

    @Test
    void libraryHasExpectedSizeAfterAddingBooks() {
        LibraryManager library = new LibraryManager();
        library.addBook("Siddhartha", "Hermann Hesse");
        library.addBook("Sense and Sensibility", "Jane Austen");
        library.addBook("Moby-Dick", "Herman Melville");

        assertEquals(3, library.getLibrary().size());
    }
}
