package com.alaw810.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class LibraryManager {
    private ArrayList<Book> library;

    public LibraryManager() {
        this.library = new ArrayList<>();
    }

    public ArrayList<Book> getLibrary() {
        return new ArrayList<>(this.library);
    }

    public void addBook(String title) {
        for (Book book : library) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return;
            }
        }
        this.library.add(new Book(title));
        sortLibrary();
    }

    public String getBookTitleAtPosition(int position) {
        return library.get(position).getTitle();
    }

    public void addBookAtPosition(String title, int position) {
        if (position < 0 || position > library.size()) {
            throw new IllegalArgumentException("Invalid position: " + position);
        }

        for (Book book : library) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return;
            }
        }
        this.library.add(position, new Book(title));
    }

    public void removeBookByTitle(String title) {
        Iterator<Book> it = library.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                it.remove();
                sortLibrary();
                return;
            }
        }
    }

    private void sortLibrary() {
        Collections.sort(library);
    }
}
