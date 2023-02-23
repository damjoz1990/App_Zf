package com.example.app_zf.book;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}")
    ResponseEntity<BookDto> getBookById(@PathVariable Long id){
        return bookService.getBookById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    ResponseEntity<BookDto> saveBook(@PathVariable BookDto bookDto){
        BookDto savedBook = bookService.seveBook(bookDto);
        URI svedBookUri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("{i}")
                .buildAndExpand(savedBook.getId())
                .toUri();
        return ResponseEntity.created(svedBookUri).body(savedBook);
    }




}
