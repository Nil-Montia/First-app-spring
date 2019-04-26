package com.qa.Repository;

import com.qa.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BooksRepository extends JpaRepository<Book, Long> {
    Book findByAuthor(String author);
    List<Book> findBookByAuthor(String author);

    @Override
    void delete(Long aLong);
}
