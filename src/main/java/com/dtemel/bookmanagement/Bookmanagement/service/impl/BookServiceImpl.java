package com.dtemel.bookmanagement.Bookmanagement.service.impl;

import com.dtemel.bookmanagement.Bookmanagement.entity.Book;
import com.dtemel.bookmanagement.Bookmanagement.repository.BookRepository;
import com.dtemel.bookmanagement.Bookmanagement.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book getById(Long id) {
        return bookRepository.getOne(id);
    }

    @Override
    public Book update(Long id, Book book) {

        Book oldBook = getById(id);
        if (oldBook != null) {
            oldBook.setAuthor(book.getAuthor());
            oldBook.setBookName(book.getBookName());
        }
        return oldBook;
    }

    @Override
    public Book create(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public boolean delete(Long id) {
        Book oldBook = getById(id);
        bookRepository.delete(oldBook);
        return true;
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
}
