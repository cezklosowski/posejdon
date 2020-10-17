package com.cezklosowski.module.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksController {

    @Autowired
    private BooksRepository booksRepository;

    @GetMapping("/rest/books/{id}")
    public BooksEntity getBook(@PathVariable Long id){
        return booksRepository.findById(id).get();
    }

    @GetMapping("/rest/books")
    public List<BooksEntity> getBooks() {
        return booksRepository.findAll();
    }

    @PostMapping("/rest/books")
    public BooksEntity newBooks(@RequestBody BooksEntity booksEntity) {
        return booksRepository.saveAndFlush(booksEntity);
    }

    @DeleteMapping("/rest/books/{id}")
    public void deleteBooks(@PathVariable Long id) {
        booksRepository.deleteById(id);
    }
}
