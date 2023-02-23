package com.example.app_zf.book;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {
    private BookRepository bookRepository;
    private BookDtoMapper bookDtoMapper;

    public BookService(BookRepository bookRepository, BookDtoMapper bookDtoMapper) {
        this.bookRepository = bookRepository;
        this.bookDtoMapper = bookDtoMapper;
    }

    Optional<BookDto> getBookById(Long id){
        return bookRepository.findById(id).map(bookDtoMapper::map);
    }

    BookDto seveBook(BookDto book){
        Book saveBook = bookDtoMapper.map(book);
        Book savedBook = bookRepository.save(saveBook);
        return bookDtoMapper.map(savedBook);
    }


}
