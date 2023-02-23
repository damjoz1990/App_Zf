package com.example.app_zf.book;

import com.example.app_zf.writer.Writer;
import com.example.app_zf.writer.WriterRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class BookDtoMapper {

    public final WriterRepository writerRepository;

    public BookDtoMapper(WriterRepository writerRepository) {
        this.writerRepository = writerRepository;
    }

    BookDto map(Book book){
        BookDto dto = new BookDto();
        dto.setId(book.getId());
        dto.setTitle(book.getTitle());
        dto.setPublisher(book.getPublisher());
        dto.setPages(book.getPages());
        dto.setWriterId(book.getWriter().getId());
        dto.setWriterName(book.getWriter().getFirstName()+ " " + book.getWriter().getLastName());
        return dto;
    }

    Book map(BookDto dto){
        Book book = new Book();
        book.setId(dto.getId());
        book.setTitle(dto.getTitle());
        book.setPublisher(dto.getPublisher());
        book.setDescription(book.getDescription());
        Writer writer = writerRepository.findById(dto.getWriterId()).orElseThrow();
        book.setWriter(writer);
        return book;
    }
}
