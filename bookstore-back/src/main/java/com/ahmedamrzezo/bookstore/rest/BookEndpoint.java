package main.java.com.ahmedamrzezo.bookstore.rest;

import com.ahmedamrzezo.bookstore.repository.BookRepository;

@Path("/books")
public class BookEndpoint {
	@Inject
	private BookRepository bookRepository;
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getBook(Long id) {
		Book book = bookRepository.find(id);
		if (book == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		return Response.ok(book).build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getBooks() {
		return Response.ok(bookRepository.findAll()).build();
	}

	@GET
	@Path("/count")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getBookCount() {		
		return Response.ok(bookRepository.getCount()).build();
	}
}
