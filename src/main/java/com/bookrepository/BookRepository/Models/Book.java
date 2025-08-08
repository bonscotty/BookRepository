package com.bookrepository.BookRepository.Models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "books", indexes = {
        @Index(name = "idx_title", columnList = "title"),
        @Index(name = "idx_author", columnList = "author"),
        @Index(name = "idx_genre", columnList = "genre")
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "isbn",nullable = false, unique = true, length=13)
    private String isbn;

    @Column(name = "title", nullable = false, length=255)
    private String title;

    @Column(name = "author", nullable = false, length=100)
    private String author;

    @Column(name = "genre", nullable = false, length = 100)
    private String genre;

    @Column(name = "page_count")
    private int pageCount;

    @Column(name = "book_price", nullable = false)
    private double price;

    @Lob
    private String description;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate(){
        createdAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate(){
        updatedAt = LocalDateTime.now();
    }
}
