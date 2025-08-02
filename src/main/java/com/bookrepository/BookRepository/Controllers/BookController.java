package com.bookrepository.BookRepository.Controllers;

import com.bookrepository.BookRepository.Models.Book;
import com.bookrepository.BookRepository.Services.BookService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    //add item in DB
    @PostMapping("/book")
    public ResponseEntity<Book> saveProduct(@RequestBody Book book){
         Book savedBook = bookService.saveBook(book);
         return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    //get a single book by id
    @GetMapping("/book")
    public ResponseEntity<Book> getBook(@RequestParam(name = "bookId") long bookId)
    {
        Book book = bookService.getBook(bookId);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    //get all the books in db
    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }


}
