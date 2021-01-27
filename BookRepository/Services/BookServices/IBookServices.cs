using BookDepositoryClone.Domain;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace BookRepository.Services.BookServices
{
    public interface IBookServices
    {
        IEnumerable<Book> GetBooks();
        Book GetBook(int BookId);
    }
}
