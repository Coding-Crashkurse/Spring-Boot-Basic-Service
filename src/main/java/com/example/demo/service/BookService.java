package com.example.demo.service;

import com.example.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    public List<Book> books = new ArrayList<Book>();

    public Book addBook(Book book) {
        books.add(book);
        return book;
    }

    public List<Book> findAll() {
        return books;
    }

}
