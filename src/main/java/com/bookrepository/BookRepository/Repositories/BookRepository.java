package com.bookrepository.BookRepository.Repositories;


import com.bookrepository.BookRepository.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Query(value = "SELECT * FROM book_inventory WHERE title = ?1", nativeQuery = true)
    List<Book> getBooksByName(String bookName);
}
