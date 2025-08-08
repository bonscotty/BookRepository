package com.bookrepository.BookRepository.Models.DTOs;

import java.time.LocalDateTime;

//record because this is an immutable data object
public record BookDTO(
    String isbn,
    String title,
    String author,
    String description,
    String publicationYear,
    String genre,
    int pageCount,
    Double price
) {
}
