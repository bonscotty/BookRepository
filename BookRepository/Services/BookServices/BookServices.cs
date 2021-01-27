using BookDepositoryClone.Domain;
using System.Collections.Generic;

namespace BookRepository.Services.BookServices
{
    public class BookServices : IBookServices
    {
        public Book GetBook(int BookId)
        {
            return new Book();
        }

        public IEnumerable<Book> GetBooks()
        {
            return new List<Book>();
        }
    }
}
