using System.Collections.Generic;

namespace BookDepositoryClone.Domain
{
    public class Author : BaseIdentity
    {
        public string About { get; set; }
        public ICollection<Book> Books { get; set; }
    }
}
