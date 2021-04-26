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
        public DbSet<Author> Authors { get; set; }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.Entity<Book>().ToTable("Book");
            modelBuilder.Entity<Author>().ToTable("Author");
        }
    }
}
