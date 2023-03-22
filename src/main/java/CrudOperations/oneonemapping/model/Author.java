package CrudOperations.oneonemapping.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="Author_name")
	private String name;
	
	
	@OneToOne
	private Book book;
	
	public Author() {
	
	}
	
	public Author(Long author_id, String name, Book book) {
		super();
		this.id = author_id;
		this.name = name;
		this.book = book;
	}
	
	public Long getAuthor_id() {
		return id;
	}
	public void setAuthor_id(long i) {
		this.id = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String author_name) {
		name = author_name;
	}
	
	public void setAuthor_id(Long author_id) {
		this.id = author_id;
	}
	
	
	
	
	
	
	
}
