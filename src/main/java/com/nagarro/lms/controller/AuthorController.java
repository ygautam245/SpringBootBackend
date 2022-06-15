package com.nagarro.lms.controller;

import com.nagarro.lms.model.Author;
import com.nagarro.lms.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping("/authors")
    private List<Author> getAuthorList(){
        return authorService.getAuthors();
    }

    @GetMapping("/authors/{authorID}")
    private Author getAuthor(@PathVariable("authorID") int authorID){
        return authorService.getAuthor(authorID);
    }

    @PostMapping("/authors")
    private Author addAuthor(@RequestBody Author author) {
        return authorService.addAuthor(author);
    }

    @DeleteMapping("/books/{authorID}")
    private String deleteAuthor(@PathVariable String authorID) {
        authorService.deleteAuthor(Integer.parseInt(authorID));
        return "Deleted: " + authorID;
    }

}
