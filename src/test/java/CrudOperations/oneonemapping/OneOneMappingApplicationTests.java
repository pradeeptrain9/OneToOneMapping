package CrudOperations.oneonemapping;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import CrudOperations.oneonemapping.model.Author;
import CrudOperations.oneonemapping.model.Book;
import CrudOperations.oneonemapping.repository.BookRepository;

@SpringBootTest
class OneOneMappingApplicationTests {
	@Autowired
	BookRepository bookRepo;
	
	@Test
	public void testaddBook()
	{
		Book p = new Book();
		Author a = new Author();
		a.setName("shyam");
		p.setId(65L);
		p.setTitle("heya");
		p.setAuthor(a);
		bookRepo.save(p);
		
		assertNotNull(bookRepo.findById(65L).get());
	}
	
	@Test
	public void testgetAllBooks()
	{
		List<Book> list = (List<Book>) bookRepo.findAll();
		assertTrue(list.size()==bookRepo.count());
	}
	
	@Test
	public void testdeleteBook()
	{
		bookRepo.deleteById(65L);
		assertTrue(bookRepo.existsById(65L)==false);
	}
	
	@Test
	public void testupdateBook()
	{
		Book b = bookRepo.findById(3L).get();
		b.setTitle("jungle book version 2.0");
		bookRepo.save(b);
		assertEquals("jungle book version 2.0",bookRepo.findById(3L).get().getTitle());
	}

	

}
