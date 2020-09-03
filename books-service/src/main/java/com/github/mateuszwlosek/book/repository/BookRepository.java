package com.github.mateuszwlosek.book.repository;

import com.github.mateuszwlosek.book.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface BookRepository extends MongoRepository<Book, String> {

	Optional<Book> findOneByTitle(String title);
}
