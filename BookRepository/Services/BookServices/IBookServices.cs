using BookDepositoryClone.Domain;
using System.Collections.Generic;

namespace BookRepository.Services.BookServices
{
    public interface IBookServices
    {
        Book GetBook(int BookId); 
        List<Book> GetAllBooks();
        Book PostBook(Book bookData);
        Book UpdateBook(Book id);
        Book MassUpdateBook(List<Book> books);
        bool DeleteBook(Book id);
    }
}
