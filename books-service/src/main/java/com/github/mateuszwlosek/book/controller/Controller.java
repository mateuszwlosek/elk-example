package com.github.mateuszwlosek.book.controller;

import com.github.mateuszwlosek.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("book")
@RequiredArgsConstructor
public class Controller {

	private final BookService service;

	@PostMapping(value = "/buy/{bookTitle}")
	public void buyBook(@PathVariable final String bookTitle, @RequestParam final String userName) {
		service.buyBook(bookTitle, userName);
	}
}
