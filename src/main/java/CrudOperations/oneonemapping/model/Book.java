package CrudOperations.oneonemapping.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Book {
	
	@Id
	@Column(name="book_id")
	private long id;
	
	@Column(name="Title")
	private String title;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Author author;
	
	public Book() {
		
	}
	
	public Book(long id, String title, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
}
