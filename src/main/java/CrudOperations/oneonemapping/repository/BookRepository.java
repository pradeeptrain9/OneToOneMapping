package CrudOperations.oneonemapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import CrudOperations.oneonemapping.model.Book;

public interface BookRepository extends JpaRepository<Book,Long> {
	
	@Query(value = "Select b.title From Book b join b.author a where a.id= :id")
	public String getBookByAuthorID(@Param("id") long author_id);
}
