package CrudOperations.oneonemapping.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import CrudOperations.oneonemapping.model.Author;
import CrudOperations.oneonemapping.model.Book;
import CrudOperations.oneonemapping.repository.AuthorRepository;

@Service
public class AuthorService {
	@Autowired
	public AuthorRepository authorRepo;
	public List<Author> getAllAuthors() {
		
		List<Author> authors = new ArrayList<>();
		authorRepo.findAll().forEach(authors::add);
		return authors;
	}
	public String getBookByID(Long id) {
		Author author = authorRepo.findById(id).get();
		return null;
		
	}
	public void addAuthor(Author author) {
		// TODO Auto-generated method stub
		authorRepo.save(author);
	}
	public void deleteAuthor(long id) {
		// TODO Auto-generated method stub
		authorRepo.deleteById(id);
	}
	
}
