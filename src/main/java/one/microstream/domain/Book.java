package one.microstream.domain;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Book
{
	private String		isbn;
	private String		bookName;
	private LocalDate	release;
	private BigDecimal	pricePerBook;
	private Author		author;
	
	public Book()
	{
		super();
	}
	
	public Book(String isbn, String bookName, LocalDate release, BigDecimal pricePerBook, Author author)
	{
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.pricePerBook = pricePerBook;
		this.author = author;
	}
	
	public String getIsbn()
	{
		return isbn;
	}
	
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	
	public String getBookName()
	{
		return bookName;
	}
	
	public void setBookName(String bookName)
	{
		this.bookName = bookName;
	}
	
	public BigDecimal getPricePerBook()
	{
		return pricePerBook;
	}
	
	public void setPricePerBook(BigDecimal pricePerBook)
	{
		this.pricePerBook = pricePerBook;
	}
	
	public Author getAuthor()
	{
		return author;
	}
	
	public void setAuthor(Author author)
	{
		this.author = author;
	}
	
	public LocalDate getRelease()
	{
		return release;
	}
	
	public void setRelease(LocalDate release)
	{
		this.release = release;
	}
	
}
