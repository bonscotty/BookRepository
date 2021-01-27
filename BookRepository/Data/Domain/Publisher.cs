namespace BookDepositoryClone.Domain
{
    public class Publisher : BaseIdentity
    {
        public string Name { get; set; }
        public string Address { get; set; }
    }

    public class Imprint : BaseIdentity
    {
        public string Name { get; set; }
        public Publisher Publisher { get; set; }
    }
}
