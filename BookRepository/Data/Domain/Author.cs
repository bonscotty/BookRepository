using System.Collections.Generic;

namespace BookDepositoryClone.Domain
{
    public class Author : Illustrator
    {
        public string About { get; set; }
        public ICollection<Book> Books { get; set; }
    }
}
