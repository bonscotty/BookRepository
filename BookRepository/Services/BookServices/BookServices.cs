using BookDepositoryClone.Domain;
using BookRepository.Data;
using System.Collections.Generic;
using System.Linq;

namespace BookRepository.Services.BookServices
{
    public class BookServices : IBookServices
    {
        private readonly BookRepoContext _context;
        public BookServices(BookRepoContext context)
        {
            _context = context;
        }

        public bool DeleteBook(Book id)
        {
            throw new System.NotImplementedException();
        }

        public List<Book> GetAllBooks()
        {
            return _context.Books.Where(x => x.IsDelete == false).ToList();
        }

        public Book GetBook(int id)
        {
            return _context.Books.FirstOrDefault(x => x.IsDelete == false && x.Id == id);
        }

        public Book MassUpdateBook(List<Book> books)
        {
            throw new System.NotImplementedException();
        }

        public Book PostBook(Book bookData)
        {
            throw new System.NotImplementedException();
        }

        public Book UpdateBook(Book id)
        {
            throw new System.NotImplementedException();
        }
    }
}
