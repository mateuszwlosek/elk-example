package com.github.mateuszwlosek.order.repository;

import com.github.mateuszwlosek.order.domain.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}
