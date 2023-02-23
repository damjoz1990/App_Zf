package com.example.app_zf.writer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WriterController {
    private final WriterSerwice writerSerwice;


    public WriterController(WriterSerwice writerSerwice) {
        this.writerSerwice = writerSerwice;
    }

    @GetMapping("/companies/{id}")
    ResponseEntity<WriterDto> getWriterById(@PathVariable Long id){
     return writerSerwice.getWriterById(id)
               .map(ResponseEntity::ok)
               .orElse(ResponseEntity.notFound().build());
    }


}
