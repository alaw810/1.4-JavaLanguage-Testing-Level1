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
        library.addBook("Siddhartha");
        library.addBook("Sense and Sensibility");
        library.addBook("Moby-Dick");

        assertEquals(3, library.getLibrary().size());
    }

    @Test
    void canRetrieveBookTitleByIndex() {
        LibraryManager library = new LibraryManager();
        library.addBook("Siddhartha");
        library.addBook("Sense and Sensibility");
        library.addBook("Moby-Dick");

        String title = library.getBookTitleAtPosition(1);
        assertEquals("Sense and Sensibility", title);
    }

    @Test
    void cannotAddDuplicateBookTitles() {
        LibraryManager library = new LibraryManager();
        library.addBook("Moby-Dick");
        library.addBook("Moby-Dick");

        assertEquals(1, library.getLibrary().size());
    }

    @Test
    void canAddBookAtSpecificPosition() {
        LibraryManager library = new LibraryManager();
        library.addBook("Siddhartha");
        library.addBook("Sense and Sensibility");

        library.addBookAtPosition("Moby-Dick",1);

        assertEquals("Moby-Dick", library.getBookTitleAtPosition(1));
    }
}
