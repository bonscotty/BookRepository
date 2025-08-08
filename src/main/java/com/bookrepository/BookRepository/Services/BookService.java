package com.bookrepository.BookRepository.Services;

import com.bookrepository.BookRepository.Mappers.BookMapper;
import com.bookrepository.BookRepository.Models.Book;
import com.bookrepository.BookRepository.Models.DTOs.BookDTO;
import com.bookrepository.BookRepository.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookService(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public Book getBook(long bookId) {
        return bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book Not Found!"));
    }

    //TODO: Implement pagination for this method
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public List<Book> getBooksByName(String bookName) {
        return new List<Book>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Book> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Book book) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Book> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Book> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Book get(int index) {
                return null;
            }

            @Override
            public Book set(int index, Book element) {
                return null;
            }

            @Override
            public void add(int index, Book element) {

            }

            @Override
            public Book remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Book> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Book> listIterator(int index) {
                return null;
            }

            @Override
            public List<Book> subList(int fromIndex, int toIndex) {
                return List.of();
            }
        };
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public BookDTO updateBook(long bookId, BookDTO requestBook) {
        Book existingBook = bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book Not Found!"));

        return bookMapper(requestBook,existingBook);
    }

//    public BookDTO deleteBook(){
//        return new BookDTO();
//    }

    //local methods
    private BookDTO bookMapper(BookDTO sourceBook, Book destinationBook) {
        bookMapper.updateBookFromDTO(sourceBook, destinationBook);
        Book updatedBook = bookRepository.save(destinationBook);
        //TODO: add logging that book is saved successfully
        return bookMapper.bookDTOToBook(updatedBook);
    }
}