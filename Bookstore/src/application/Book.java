package application;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO) 	
	 
	 private int id;
	 private String title;
	 private String author;
	 private int price;
	 protected Book() {}
	 
	 public Book(int id, String title, String author, Integer price) {
		 	this.id = id;
	        this.title = title;
	        this.author = author;
	        this.price = price;
	    }
   
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public Integer getPrice() {
	return price;
}
public void setPrice(int i) {
	this.price = i;
}

@Override
public String toString() {
   return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + "]";
}

public void setID(int i) {
	this.id = i;	
}


}
