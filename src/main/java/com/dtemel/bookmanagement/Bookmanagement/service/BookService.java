package com.dtemel.bookmanagement.Bookmanagement.service;

import com.dtemel.bookmanagement.Bookmanagement.entity.Book;

import java.util.List;

public interface BookService {

    Book getById(Long id);

    Book update(Long id, Book book);

    Book create(Book book);

    boolean delete(Long id);

    List<Book> getAll();
}


