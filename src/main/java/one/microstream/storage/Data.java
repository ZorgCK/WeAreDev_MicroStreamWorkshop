package one.microstream.storage;

import java.util.ArrayList;
import java.util.List;

import io.micronaut.core.annotation.Introspected;
import one.microstream.domain.Book;


@Introspected
public class Data
{
	private final List<Book> books = new ArrayList<Book>();
	
	public List<Book> getBooks()
	{
		return books;
	}
}
