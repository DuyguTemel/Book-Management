package com.dtemel.bookmanagement.Bookmanagement.repository;

import com.dtemel.bookmanagement.Bookmanagement.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
