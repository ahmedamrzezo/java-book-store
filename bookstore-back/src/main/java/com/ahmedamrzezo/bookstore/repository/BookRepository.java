package com.ahmedamrzezo.bookstore.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ahmedamrzezo.bookstore.Book;
import com.ahmedamrzezo.bookstore.util.TextUtil;

public class BookRepository {
	@PersistenceContext(name = "bookstorePU")
	private EntityManager em;

	@Inject
	private TextUtil textUtil;

	@Inject
	private NumberGenerator generator;

	public Book find(Long id) {
		return em.find(Book.class, id);
	}
	public Book create(Book book) {
		String sanitziedTitle = textUtil.sanitize(book.getTitle());
		book.setTitle(sanitziedTitle);
		book.setIsbn(generator.generateNumber());
		em.persist(book);
		return book;
	}
	public void delete(Long id) {
		Book book = em.find(Book.class, id);
		if (book != null) {
			em.remove(book);
		}
	}

	public List<Book> findAll() {
		TypedQuery<Book> query = em.createQuery("SELECT b FROM Book b", Book.class);
		return query.getResultList();
	}
	public Long getCount() {
		return em.createQuery("SELECT COUNT(b) FROM Book b", Long.class).getSingleResult();
	}
}
