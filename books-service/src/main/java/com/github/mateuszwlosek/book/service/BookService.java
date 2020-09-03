package com.github.mateuszwlosek.book.service;

import com.github.mateuszwlosek.book.domain.Book;
import com.github.mateuszwlosek.book.exception.BookNotFoundException;
import com.github.mateuszwlosek.book.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class BookService {

	private final BookRepository repository;
	private final OrdersServiceClient ordersServiceClient;

	public void buyBook(final String title, final String userName) {
		final Book book = getBook(title);
		log.info("User: {} bought a book: {}", userName, book);

		ordersServiceClient.createOrder(userName, book.getId());
	}

	private Book getBook(final String title) {
		return repository.findOneByTitle(title)
			.orElseThrow(() -> new BookNotFoundException(title));
	}
}
