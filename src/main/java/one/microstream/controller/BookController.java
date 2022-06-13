package one.microstream.controller;

import java.util.List;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import one.microstream.domain.Book;
import one.microstream.storage.DB;
import one.microstream.utils.MockupUtils;

@Controller("/books")
public class BookController {
	@Get("/create")
	public HttpResponse<?> createBooks() {
		List<Book> loadMockupData = MockupUtils.loadMockupData();

		DB.root.getBooks().addAll(loadMockupData);
		DB.storageManager.store(DB.root.getBooks());

		return HttpResponse.ok("Books successfully created!");
	}

	@Get
	public List<Book> getBook() {
		return DB.root.getBooks();
	}

	@Get("/startsWith_A")
	public List<Book> getBooksWithA() {
//		return DB.root.getBooks().stream().filter(b -> b.getName().startsWith("A")).collect(Collectors.toList());
		return null;
	}

	@Get("/clear")
	public HttpResponse<?> clearBooks() {
//		DB.root.getBooks().clear();
//		DB.storageManager.store(DB.root.getBooks());

		return HttpResponse.ok("Books successfully cleared!");
	}

	@Get("/updateSingle")
	public HttpResponse<?> updateSingleBook() {
//		Book book = DB.root.getBooks().stream().findFirst().get();
//		book.setRelease(LocalDate.now());
//		
//		DB.storageManager.store(book);

		return HttpResponse.ok("Book successfully updated!");
	}

	@Get("/updateMulti")
	public HttpResponse<?> updateMultiBooks() {
//		Storer es = DB.storageManager.createEagerStorer();
//
//		DB.root.getBooks().stream().filter(b -> b.getName().startsWith("A")).forEach(b -> {
//			BigDecimal value = b.getPrice().multiply(new BigDecimal(0.9));
//			b.setPrice(value);
//
//			es.store(es);
//		});
//
//		es.commit();

		return HttpResponse.ok("Bookss successfully updated!");
	}
}
