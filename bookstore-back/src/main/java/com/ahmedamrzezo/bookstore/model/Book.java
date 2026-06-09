package com.ahmedamrzezo.bookstore;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

		@Column(length = 100)
    private String title;

		@Column(length = 2000)
		private String description;

    private String author;

    private Double price;

		@Column(length = 13)
		private String isbn;

		private Date publishedDate;

		private String coverImageUrl;

		private Integer numberOfPages;

		@Enumerated(EnumType.STRING)
		private Language language;

    public Book() {
    }

    public Book(String title, String description, String author, Double price, String isbn, Date publishedDate, String coverImageUrl, Integer numberOfPages, Language language) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        this.publishedDate = publishedDate;
        this.coverImageUrl = coverImageUrl;
        this.numberOfPages = numberOfPages;
        this.language = language;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}

		public Date getPublishedDate() {
			return publishedDate;
		}

		public void setPublishedDate(Date publishedDate) {
			this.publishedDate = publishedDate;
		}

		public String getCoverImageUrl() {
			return coverImageUrl;
		}

		public void setCoverImageUrl(String coverImageUrl) {
			this.coverImageUrl = coverImageUrl;
		}

		public Integer getNumberOfPages() {
			return numberOfPages;
		}

		public void setNumberOfPages(Integer numberOfPages) {
			this.numberOfPages = numberOfPages;
		}

		public Language getLanguage() {
			return language;
		}

		public void setLanguage(Language language) {
			this.language = language;
		}
}
