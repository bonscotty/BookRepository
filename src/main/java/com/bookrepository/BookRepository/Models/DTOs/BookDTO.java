package com.bookrepository.BookRepository.Models.DTOs;

public record BookDTO(
        String isbn,
        String title,
        String author,
        String publicationYear,
        String genre,
        Double price
) {}
