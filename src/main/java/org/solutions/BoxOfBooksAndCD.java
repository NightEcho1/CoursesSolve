package org.solutions;

import java.util.ArrayList;

public class BoxOfBooksAndCD implements Packable {
    private ArrayList<Book> books;
    private ArrayList<CD> cds;
    private double weight;
    private double currentWeight;

    public BoxOfBooksAndCD(double weight) {
        this.books = new ArrayList<>();
        this.cds = new ArrayList<>();
        this.weight = weight;
        this.currentWeight = 0;
    }

    public void add(Book book) {
        if ((this.currentWeight + book.weight()) > this.weight) {
            System.out.println("You can not obtain more items in this box");
        } else {
            books.add(book);
            this.currentWeight += book.weight();
        }
    }

    public void add(CD cd) {
        if ((this.currentWeight + cd.weight()) > this.weight) {
            System.out.println("You can not obtain more items in this box");
        } else {
            cds.add(cd);
            this.currentWeight += cd.weight();
        }
    }

    @Override
    public double weight() {
        return this.currentWeight;
    }

    @Override
    public String toString() {
        return "Box: " + (books.size() + cds.size()) + " items, " + "total weight " + weight();
    }
}
