/**
 * 
 */
package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import application.Book;

/**
 * @author EFRELAT
 *
 */
public class BookListImpl implements BookList {

	public Book[] list(String searchString) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean add(Book book, int amount) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	      book.setID(10);
	      book.setAuthor("kalle");
	      book.setPrice(20);
	      book.setTitle("Nisse");
	      entitymanager.persist( book );
	      entitymanager.getTransaction( ).commit( );

	      entitymanager.close( );
	      emfactory.close( );
		return false;
	}

	public int[] buy(Book... books) {
		// TODO Auto-generated method stub
		return null;
	}

}
