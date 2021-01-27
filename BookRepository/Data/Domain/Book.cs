using System;

namespace BookDepositoryClone.Domain
{
    public class Book : BaseIdentity
    {
        public string ISBN { get; set; }
        public string Title { get; set; }
        public string AuthorName { get; set; }
        public string IllustratorName { get; set; }
        public string Description { get; set; }
        public decimal CurrentPrice { get; set; }
        public decimal OriginalPrice { get; set; }
        public decimal Savings { get; set; }
        public string Format { get; set; }
        public int Pages { get; set; }
        public DateTime PublicationDate { get; set; }
        public string Dimensions { get; set; }
        public decimal Weight { get; set; }
        public string PublicationLocation { get; set; }
        public int BestsellerRank { get; set; }

        //todo: to link reviews
        //todo: to link author info

        //public Publisher Publisher { get; set; }
        //public Imprint Imprint { get; set; }
        //public BookCategory Categories { get; set; }
        //public Illustrator Illustrator { get; set; }
        //public Author Author { get; set; }
        //1 book -> 1 publisher
    }
}
