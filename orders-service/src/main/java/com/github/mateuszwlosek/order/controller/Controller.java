package com.github.mateuszwlosek.order.controller;

import com.github.mateuszwlosek.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("order")
@RestController
@RequiredArgsConstructor
public class Controller {

	private final OrderService service;

	@PostMapping
	void createOrder(@RequestParam final String userName, @RequestParam final String bookId) {
		service.createOrder(bookId, userName);
	}
}
