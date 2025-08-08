package com.bookrepository.BookRepository.Controllers;

import com.bookrepository.BookRepository.Models.Book;
import com.bookrepository.BookRepository.Models.DTOs.BookDTO;
import com.bookrepository.BookRepository.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

//region GET endpoints
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

    //get product by name using a raw SQL statement
    @GetMapping("/books-by-name")
    public List<Book> getBooksByName(@RequestParam(name = "bookName") String bookName)
    {
        return bookService.getBooksByName(bookName);
    }
//endregion

//region POST endpoints
    //add item in DB
    @PostMapping("/book")
    public ResponseEntity<Book> saveProduct(@RequestBody Book book){
         Book savedBook = bookService.saveBook(book);
         return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }
//endregion

//region PATCH endpoints
    //update an existing book in db
    @PatchMapping("/book")
    public ResponseEntity<BookDTO> updateBook(@RequestParam(name="bookId") long bookId, @RequestBody BookDTO book)
    {
        BookDTO updatedBook = bookService.updateBook(bookId, book);
        return new ResponseEntity<>(updatedBook, HttpStatus.OK);
    }
//endregion

//region DELETE endpoints
//    @DeleteMapping("/book")
//    public ResponseEntity<BookDTO> deleteBook(@RequestParam(name="bookId") long bookId)
//    {
//        BookDTO deletedBook = bookService.deleteBook(bookId);
//        return new ResponseEntity<>(deletedBook, HttpStatus.OK);
//    }
//endregion
}
