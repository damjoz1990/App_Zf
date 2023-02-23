package com.example.app_zf.writer;

import org.springframework.stereotype.Service;

@Service
public class WriterDtoMapper {
    WriterDto map(Writer writer){
        WriterDto dto = new WriterDto();
        dto.setId(writer.getId());
        dto.setFirstName(writer.getFirstName());
        dto.setLastName(writer.getLastName());
        dto.setGenre(writer.getGenre());
        return dto;
    }
}
