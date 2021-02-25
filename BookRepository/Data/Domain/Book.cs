using System;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace BookDepositoryClone.Domain
{
    public class Book : BaseIdentity
    {
        [Required]
        public string ISBN { get; set; }
        [Required]
        public string Title { get; set; }
        [Required]
        public string AuthorName { get; set; }
        public string IllustratorName { get; set; }
        [Required]
        public string Description { get; set; }
        [Required]
        [Column(TypeName = "decimal(18,4)")]
        public decimal CurrentPrice { get; set; }
        [Required]
        [Column(TypeName = "decimal(18,4)")]
        public decimal OriginalPrice { get; set; }
        [Column(TypeName = "decimal(18,4)")]
        public decimal Savings { get; set; } //todo: find a good way to do this
        [Required]
        public string Format { get; set; }
        [Required]
        public int Pages { get; set; }
        public DateTime PublicationDate { get; set; }
        [Required]
        [Column(TypeName = "decimal(18,4)")]
        public decimal DimensionX { get; set; }
        [Required]
        [Column(TypeName = "decimal(18,4)")]
        public decimal DimensionY { get; set; }
        [Required]
        [Column(TypeName = "decimal(18,4)")]
        public decimal DimensionZ { get; set; }
        [Required]
        [Column(TypeName = "decimal(18,4)")]
        public decimal Weight { get; set; }
        public string PublicationLocation { get; set; }
        public int BestsellerRank { get; set; }

        //todo: use mongoDB to store reviews
        //todo: to link author info

        //public Publisher Publisher { get; set; }
        //public Imprint Imprint { get; set; }
        //public BookCategory Categories { get; set; }
        //public Illustrator Illustrator { get; set; }
        //public Author Author { get; set; }
        //1 book -> 1 publisher
    }
}
