package com.bookrepository.BookRepository.Mappers;

import com.bookrepository.BookRepository.Models.Book;
import com.bookrepository.BookRepository.Models.DTOs.BookDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    //source -> DTO
    Book bookToBookDTO (BookDTO bookDTO);

    //DTO -> source
//    @Mapping(target = "id", ignore = true)
//    @Mapping(target = "createdAt", ignore = true)
    BookDTO bookDTOToBook (Book book);

    //DTO -> source, ignore nulls
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    void updateBookFromDTO(BookDTO bookDTO, @MappingTarget Book book);
}