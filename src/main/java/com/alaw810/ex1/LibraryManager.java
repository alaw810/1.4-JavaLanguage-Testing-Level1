package com.alaw810.ex1;

import java.util.ArrayList;

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
}
