package com.nagarro.lms.service;

import com.nagarro.lms.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<Author> getAuthors();

    Author getAuthor(int authorID);

    Author addAuthor(Author author);


    void deleteAuthor(int authorID);
}
