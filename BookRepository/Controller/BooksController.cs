using BookDepositoryClone.Domain;
using BookRepository.Services.BookServices;
using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;

namespace BookRepository.Controller
{
    [Route("api/book")]
    [ApiController]
    public class BooksController : ControllerBase
    {
        private readonly IBookServices _bookService;
        public BooksController(IBookServices bookService)
        {
            _bookService = bookService;
        }

        [HttpGet]
        public ActionResult<IEnumerable<Book>> GetBooks()
        {
            var books = _bookService.GetBooks();
            return Ok(books);
        }

        [HttpGet("{id}")]
        public ActionResult<Book> GetBook(int id)
        {
            var book = _bookService.GetBook(id);
            return Ok(book);
        }
    }
}
