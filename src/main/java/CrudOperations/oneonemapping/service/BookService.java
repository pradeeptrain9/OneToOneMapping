package CrudOperations.oneonemapping.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import CrudOperations.oneonemapping.repository.AuthorRepository;
import CrudOperations.oneonemapping.repository.BookRepository;
import jakarta.persistence.EntityManager;
import CrudOperations.oneonemapping.model.Author;
import CrudOperations.oneonemapping.model.Book;

@Service
public class BookService {
	@Autowired
	public BookRepository bookRepository;
	
	@Autowired
	public EntityManager entityManager;
	
	@Autowired
	public AuthorRepository authorRepo;
	
	public List<Book> getAllBooks()
	{
		List<Book> books = new ArrayList<>();
		bookRepository.findAll().forEach(books::add);
		System.out.println("hello");
		return books;
	}

	public void addBook(Book book) {
		// TODO Auto-generated method stub
//		Author author = new Author();
//		author.setName(book.getAuthor().getName());
//		author.setAuthor_id(book.getAuthor().getAuthor_id());
//		entityManager.persist(author);
		
		bookRepository.save(book);
	}

	public void updateBook(long id, Book book) {
		// TODO Auto-generated method stub
		bookRepository.save(book);
		
	}

	public void deleteBook(long id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);
	}
	
	public String getAuthorByID(Long id)
	{
		Author author = bookRepository.findById(id).get().getAuthor();
		return author.getName();
	}

	public String getTitleByAuthorID(long id) {
		// TODO Auto-generated method
		String book_name=bookRepository.getBookByAuthorID(id);
		return book_name;
		
		
	}

	
}
