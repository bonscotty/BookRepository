using BookDepositoryClone.Domain;
using Microsoft.EntityFrameworkCore;

namespace BookRepository.Data
{
    public class BookRepoContext : DbContext
    {
        public BookRepoContext(DbContextOptions<BookRepoContext> opt) : base(opt)
        {
            
        }

        public DbSet<Book> Books { get; set; }
    }
}
