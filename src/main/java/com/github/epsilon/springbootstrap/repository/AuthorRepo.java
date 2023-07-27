package com.github.epsilon.springbootstrap.repository;

import com.github.epsilon.springbootstrap.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {
}
