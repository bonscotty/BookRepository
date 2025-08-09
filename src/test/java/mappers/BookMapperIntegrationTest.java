package mappers;

import com.bookrepository.BookRepository.BookRepositoryApplication;
import com.bookrepository.BookRepository.Mappers.BookMapper;
import com.bookrepository.BookRepository.Models.Book;
import com.bookrepository.BookRepository.Models.DTOs.BookDTO;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest(classes = BookRepositoryApplication.class)
public class BookMapperIntegrationTest {
    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Test
    public void BookModelToDTO_whenMaps_thenCorrect(){
        Book elricBook = new Book();
        elricBook.setIsbn("9780575077113"); // ISBN-13 for 2001 Gollancz edition
        elricBook.setTitle("Elric of Melniboné");
        elricBook.setAuthor("Michael Moorcock");
        elricBook.setGenre("Dark Fantasy");
        elricBook.setPageCount(181); // Page count for 2001 Gollancz paperback
        elricBook.setPrice(9.99); // Approximate retail price
        elricBook.setDescription(
                "Elric of Melniboné, the albino sorcerer-emperor, wields the soul-drinking sword Stormbringer. " +
                        "Last ruler of a decadent empire, he navigates a morally ambiguous world of demons, magic, " +
                        "and cosmic conflicts while struggling with his own fragile health and cursed destiny. " +
                        "A cornerstone of dark fantasy that redefined heroic tropes."
        );
        elricBook.setPublicationYear(2001);

        BookDTO elricDTO = bookMapper.bookToBookDTO(elricBook);
        assertEquals(elricBook.getIsbn(), elricDTO.isbn());
    }

    @Test
    public void BookDTOToModel_whenMaps_thenCorrect(){
        BookDTO elricDTO = new BookDTO(
                "9780575077113",
                "Elric of Melniboné",
                "Michael Moorcock",
                "Elric of Melniboné, the albino sorcerer-emperor, wields the soul-drinking sword Stormbringer. " +
                        "Last ruler of a decadent empire, he navigates a morally ambiguous world of demons, magic, " +
                        "and cosmic conflicts while struggling with his own fragile health and cursed destiny. " +
                        "A cornerstone of dark fantasy that redefined heroic tropes.",

                2001,
                "Dark Fantasy",
                181,
                9.99
        );

        Book elricBook = bookMapper.bookDTOToBook(elricDTO);
        assertEquals(elricBook.getIsbn(), elricDTO.isbn());
    }
}
