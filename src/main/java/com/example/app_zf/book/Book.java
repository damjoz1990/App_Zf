package com.example.app_zf.book;

import com.example.app_zf.writer.Writer;
import jakarta.persistence.*;


@Entity
/*@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="book", discriminatorType = DiscriminatorType.INTEGER)*/
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String publisher;
    private String description;
    private int pages;
    @ManyToOne(optional = false)
    @JoinColumn(name = "writer_id")
    private Writer writer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

  /*  @Entity
    public class comicBook extends Book{
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        private String publisher;
        private String description;
        private int pages;

        @ManyToOne(optional = false)
        @JoinColumn(name = "writer_id")
        private Writer writer;

        @Override
        public Writer getWriter() {
            return writer;
        }

        @Override
        public void setWriter(Writer writer) {
            this.writer = writer;
        }

        @Override
        public Long getId() {
            return id;
        }

        @Override
        public void setId(Long id) {
            this.id = id;
        }

        @Override
        public String getTitle() {
            return title;
        }

        @Override
        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String getPublisher() {
            return publisher;
        }

        @Override
        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        @Override
        public String getDescription() {
            return description;
        }

        @Override
        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public int getPages() {
            return pages;
        }

        @Override
        public void setPages(int pages) {
            this.pages = pages;
        }
    }*/
}
