package com.github.epsilon.springbootstrap.repository;

import com.github.epsilon.springbootstrap.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {
}
