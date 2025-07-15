package com.alaw810.ex1;

import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Book> library;

    public LibraryManager() {
        this.library = new ArrayList<>();
    }

    public ArrayList<Book> getLibrary() {
        return library;
    }
}
