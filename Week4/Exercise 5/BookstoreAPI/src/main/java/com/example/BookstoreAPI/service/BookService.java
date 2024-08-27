package com.example.BookstoreAPI.service;

import com.example.BookstoreAPI.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final List<Book> books = new ArrayList<>();

    public Book getBookById(int id) {
        Optional<Book> book = books.stream().filter(b -> b.getId() == id).findFirst();
        return book.orElse(null);
    }

    public Book createBook(Book book) {
        book.setId(books.size() + 1);
        books.add(book);
        return book;
    }

    public void deleteBook(int id) {
        books.removeIf(b -> b.getId() == id);
    }
}
