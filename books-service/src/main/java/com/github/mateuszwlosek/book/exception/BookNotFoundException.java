package com.github.mateuszwlosek.book.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookNotFoundException extends RuntimeException {

	private static final String MESSAGE = "Book %s was not found";

	public BookNotFoundException(final String title) {
		super(String.format(MESSAGE, title));
	}
}
