/**
 * 
 */
package cn.edu.exam;

/**
 * 定义实体类：描述书本的信息。
 * 
 * @author Administrator
 *
 */
public class Book {

	private String name = null;
	private String isbn = null;
	private Publisher publisher = null;	
	private double price = 0.00;
	private String author = null;
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
		
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
