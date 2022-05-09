package fr.eql.ai111.java.init.tp.library.v1;

import fr.eql.ai111.java.init.demo.oop.Toy;

import java.util.ArrayList;
import java.util.List;

public class Reader {

    private  String name ;
    private String surname;
    private String address;
    private List<Book> books = new ArrayList<>();


    public Reader(String name, String surname, String address, List<Book> books) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.books = books;






    }
}
