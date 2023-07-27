package com.github.epsilon.springbootstrap.controller;

import com.github.epsilon.springbootstrap.repository.AuthorRepo;
import com.github.epsilon.springbootstrap.repository.BookRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {
    private final AuthorRepo authorRepo;

    public AuthorController(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    @RequestMapping("/author")
    public String getAuthor(Model id) {
       id.addAttribute("author", authorRepo.findAll());
       return "index";
    }
}
