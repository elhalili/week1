package com.aelhalili.ensem.library;

import com.aelhalili.ensem.sortable.Sortable;

public class Book implements Sortable {
    private Integer isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (!isAvailable) throw new RuntimeException("Book is not available");
        setAvailable(false);
    }

    public void returnBook() {
        setAvailable(true);
    }

    public String getBookInfo() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", isAvailable=" + isAvailable + "]";
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Integer getId() {
        return this.getIsbn();
    }
}
