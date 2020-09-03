package com.github.mateuszwlosek.order.service;

import com.github.mateuszwlosek.order.domain.Order;
import com.github.mateuszwlosek.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderService {

	private final OrderRepository repository;

	public void createOrder(final String bookId, final String userName) {
		log.info("Creating order: for book: {}, user: {}", bookId, userName);

		final Order order = Order.builder()
			.userName(userName)
			.bookId(bookId)
			.build();

		repository.save(order);
	}
}
