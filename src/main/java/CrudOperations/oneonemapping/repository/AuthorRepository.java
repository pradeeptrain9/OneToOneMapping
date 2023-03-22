package CrudOperations.oneonemapping.repository;

import org.springframework.data.repository.CrudRepository;

import CrudOperations.oneonemapping.model.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
	
	
}
