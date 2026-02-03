package org.solutions;

public class Book implements Packable {
    private String authorName;
    private String nameOfBook;
    private double weight;

    public Book(String author, String name, double weight) {
        this.authorName = author;
        this.nameOfBook = name;
        this.weight = weight;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    @Override
    public String toString() {
        return this.authorName + ": " + this.nameOfBook;
    }

    @Override
    public double weight() {
        return this.weight;
    }
}
