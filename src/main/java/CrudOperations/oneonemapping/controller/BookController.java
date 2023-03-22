package CrudOperations.oneonemapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import CrudOperations.oneonemapping.service.BookService;
import CrudOperations.oneonemapping.model.Book;

@RestController
public class BookController {
	@Autowired
	public BookService bookService;
	
	@RequestMapping("/books")
	public List<Book> getAllBooks()
	{
		return bookService.getAllBooks();
	}
	
	@RequestMapping("/books/{id}")
	public String getBookByID(@PathVariable long id)
	{
		return bookService.getAuthorByID(id);
	}
	
	@RequestMapping("books/authors/{id}")
	public String getTitleByAuthorID(@PathVariable long id)
	{
		
		return bookService.getTitleByAuthorID(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/books")
	public void addBook(@RequestBody Book book)
	{
		bookService.addBook(book);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/books/{id}")
	public void updateBook(@PathVariable long id, @RequestBody Book book)
	{
		bookService.updateBook(id,book);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/books/{id}")
	public void deleteBook(@PathVariable long id)
	{
		bookService.deleteBook(id);
	}
}
