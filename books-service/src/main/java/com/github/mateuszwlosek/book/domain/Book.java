package com.github.mateuszwlosek.book.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class Book {

	@Id
	private String id;

	private String title;
	private int amountOfPages;
	private String language;
	private String author;
	private Date releaseDate;
}
