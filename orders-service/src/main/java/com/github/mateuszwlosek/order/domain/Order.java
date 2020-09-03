package com.github.mateuszwlosek.order.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Builder
@Data
@Document
public class Order {

	@Id
	private String id;

	private String bookId;
	private String userName;
}
