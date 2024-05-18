package com.example.demo.repository.BookRepository;
 import com.example.demo.model.Book;
 import org.springframework.data.jpa.repository.JpaRepository;
 public interface BookRepository extends JpaRepository<Book, Long> {
 }