using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace BookDepositoryClone.Domain
{
    public class BaseIdentity
    {
        public int Id { get; set; }
        public DateTime CreateDate { get; set; }
        public DateTime UpdateDate { get; set; }
        public bool IsDelete { get; set; }
    }
}
