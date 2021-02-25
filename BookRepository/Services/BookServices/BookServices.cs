using BookDepositoryClone.Domain;
using BookRepository.Data;
using System.Collections.Generic;
using System.Linq;

namespace BookRepository.Services.BookServices
{
    public class BookServices : IBookServices
    {
        private BookRepoContext _context;

        public BookServices(BookRepoContext context)
        {
            _context = context;
        }
        public Book GetBook(int BookId)
        {
            var book = _context.Books.FirstOrDefault(x => x.Id == BookId && !x.IsDelete);
            return book;
        }

        public IEnumerable<Book> GetBooks()
        {
            var books = _context.Books.Where(x => !x.IsDelete).ToList();
            return books;
        }
    }
}
