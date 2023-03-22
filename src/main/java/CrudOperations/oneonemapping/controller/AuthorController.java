package CrudOperations.oneonemapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import CrudOperations.oneonemapping.model.Author;
import CrudOperations.oneonemapping.model.Book;
import CrudOperations.oneonemapping.service.AuthorService;

@RestController
public class AuthorController {
	@Autowired
	public AuthorService authorSer;
	
	@RequestMapping("/authors")
	public List<Author> getAllBooks()
	{
		return authorSer.getAllAuthors();
	}
	
	@RequestMapping("/authors/{id}")
	public String getBookbyID(@PathVariable Long id)
	{
		return authorSer.getBookByID(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/authors")
	public void addBook(@RequestBody Author author)
	{
		authorSer.addAuthor(author);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/authors/{id}")
	public void deleteBook(@PathVariable long id)
	{
		authorSer.deleteAuthor(id);
	}
}
