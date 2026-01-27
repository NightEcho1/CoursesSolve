package org.solutions;

public class Book {
    private String name;
    private int id;

    public Book(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Book)) {
            return false;
        }

        Book comparedBook = (Book) compared;

        return this.name.equals(comparedBook.name);
    }
}
