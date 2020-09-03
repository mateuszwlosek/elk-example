/**
 * 
 */
package com.github.mateuszwlosek.book.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="orders-service", url= "${application.orders-service.url}")
public interface OrdersServiceClient {

	@PostMapping(value = "order")
	void createOrder(@RequestParam String userName, @RequestParam String bookId);
}
