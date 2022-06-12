package one.microstream.controller;

import java.util.List;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import one.microstream.domain.Book;
import one.microstream.utils.MockupUtils;


@Controller("/books")
public class BookController
{
	@Get("/create")
	public HttpResponse<?> createBooks()
	{
		List<Book> loadMockupData = MockupUtils.loadMockupData();
		
		// DB.root.getBooks().addAll(loadMockupData);
		// DB.storageManager.store(DB.root.getBooks());
		
		return HttpResponse.ok("Books successfully created!");
	}
	
	@Get
	public List<Book> getBooks()
	{
		// return DB.root.getBooks();
		
		return null;
	}
	
}
