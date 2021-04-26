using System;
using System.ComponentModel.DataAnnotations;

namespace BookDepositoryClone.Domain
{
    public class BaseIdentity
    {
        [Key]
        public int Id { get; set; }
        public DateTime CreateDate { get; set; }
        public DateTime UpdateDate { get; set; }
        public bool IsDelete { get; set; }
    }
}
