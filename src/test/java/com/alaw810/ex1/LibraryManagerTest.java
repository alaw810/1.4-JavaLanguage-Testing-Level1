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
        library.addBook("Book A");
        library.addBook("Book B");
        library.addBook("Book C");

        assertEquals(3, library.getLibrary().size());
    }

    @Test
    void canRetrieveBookTitleByIndex() {
        LibraryManager library = new LibraryManager();
        library.addBook("Book A");
        library.addBook("Book B");
        library.addBook("Book C");

        String title = library.getBookTitleAtPosition(1);
        assertEquals("Book B", title);
    }

    @Test
    void cannotAddDuplicateBookTitles() {
        LibraryManager library = new LibraryManager();
        library.addBook("Book A");
        library.addBook("Book A");

        assertEquals(1, library.getLibrary().size());
    }

    @Test
    void canAddBookAtSpecificPosition() {
        LibraryManager library = new LibraryManager();
        library.addBook("Book A");
        library.addBook("Book B");

        library.addBookAtPosition("Book C",1);

        assertEquals("Book C", library.getBookTitleAtPosition(1));
    }

    @Test
    void canRemoveBooksByTitle() {
        LibraryManager library = new LibraryManager();
        library.addBook("Book A");
        library.addBook("Book B");

        library.removeBookByTitle("Book A");

        assertEquals(1, library.getLibrary().size());
    }

    @Test
    void libraryRemainsSortedAfterAddingBooks() {
        LibraryManager library = new LibraryManager();
        library.addBook("Book C");
        library.addBook("Book B");
        library.addBook("Book A");

        assertEquals("Book A", library.getBookTitleAtPosition(0));
        assertEquals("Book B", library.getBookTitleAtPosition(1));
        assertEquals("Book C", library.getBookTitleAtPosition(2));
    }

    @Test
    void libraryRemainsSortedAfterRemovingBooks() {
        LibraryManager library = new LibraryManager();
        library.addBook("Book C");
        library.addBook("Book B");
        library.addBook("Book A");

        library.removeBookByTitle("Book B");

        assertEquals("Book A", library.getBookTitleAtPosition(0));
        assertEquals("Book C", library.getBookTitleAtPosition(1));

    }
}
