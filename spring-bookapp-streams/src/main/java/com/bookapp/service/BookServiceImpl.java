package com.bookapp.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

@Service
public class BookServiceImpl implements IBookService {
//    @Autowired
	private BookDetails bookDetails;

//autowiring bookdetails into bookserviceimpl
	@Autowired
	public void setBookDetails(BookDetails bookDetails) {
		this.bookDetails = bookDetails;
	}

	@Override
	public List<Book> getAll() {
		return bookDetails.showBooks().stream().sorted(Comparator.comparing(Book::getTitle)).toList();
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		List<Book> books = bookDetails.showBooks();

		return books.stream().filter(b -> b.getBookId().equals(bookId)).findFirst()
				.orElseThrow(() -> new BookNotFoundException("Book not found: " + bookId));
	}

	@Override
	public List<Book> getByTitleContains(String title) throws BookNotFoundException {
		return bookDetails.showBooks().stream().filter(b -> b.getTitle().equals(title)).toList();
	}

	@Override
	public List<Book> getByAuthCategory(String author, String category) throws BookNotFoundException {
		return bookDetails.showBooks().stream().filter(b -> b.getAuthor().equals(author))
				.filter(b -> b.getCategory().equals(category)).toList();

	}

	@Override
	public List<Book> getByLesserPrice(double price) throws BookNotFoundException {
		return bookDetails.showBooks().stream().filter(b -> b.getPrice() < (price)).toList();

	}

}
