package com.example.app_zf.writer;

import com.example.app_zf.book.BookDto;
import com.example.app_zf.book.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WriterSerwice {
private final WriterRepository writerRepository;
private final WriterDtoMapper writerDtoMapper;


    public WriterSerwice(WriterRepository writerRepository, WriterDtoMapper writerDtoMapper) {
        this.writerRepository = writerRepository;
        this.writerDtoMapper = writerDtoMapper;
    }

    Optional<WriterDto> getWriterById(Long id){
        return writerRepository.findById(id).map(writerDtoMapper::map);
    }

}
