package com.alaw810.ex1;

public class Book implements Comparable<Book>{
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(other.title);
    }
}
