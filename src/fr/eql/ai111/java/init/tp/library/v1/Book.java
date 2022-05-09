package fr.eql.ai111.java.init.tp.library.v1;

import java.util.Locale;

public class Book {
    private String title;
    private String author;
    private int isbn;
    private Category category;
////////////////////////////////////////////////////////////////////

    public Book() {
    }

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public Book(String title, String author, int isbn, Category category) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.category = category;

//////////////////////////////////////////////////////////////////////////////////


    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                '}';
    }
}
