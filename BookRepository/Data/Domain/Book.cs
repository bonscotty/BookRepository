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
        public int AuthorId { get; set; }

        [Required]
        public string Description { get; set; }

        [Required]
        [Column(TypeName = "decimal(5,2)")]
        public decimal CurrentPrice { get; set; }

        [Required]
        [Column(TypeName = "decimal(5,2)")]
        public decimal OriginalPrice { get; set; }

        [Required]
        public string Format { get; set; }

        [Required]
        public int Pages { get; set; }

        public DateTime PublicationDate { get; set; }

        [Required]
        [Column(TypeName = "decimal(5,2)")]
        public decimal XDimension { get; set; }

        [Required]
        [Column(TypeName = "decimal(5,2)")]
        public decimal YDimension { get; set; }

        [Required]
        [Column(TypeName = "decimal(5,2)")]
        public decimal ZDimension { get; set; }

        [Required]
        [Column(TypeName = "decimal(5,2)")]

        public decimal Weight { get; set; }

        public int BestsellerRank { get; set; }

        //todo: to link reviews

        //public Publisher Publisher { get; set; }
        //public Imprint Imprint { get; set; }
        //public BookCategory Categories { get; set; }
        //public Illustrator Illustrator { get; set; }
        public Author Author { get; set; }
        //1 book -> 1 publisher
    }
}
