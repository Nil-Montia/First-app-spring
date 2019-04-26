package com.qa.Controller;

import com.qa.Repository.BooksRepository;
import com.qa.model.Book;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class BooksController {
    @Autowired
    private BooksRepository booksRepository;

    @RequestMapping(value = "books", method = RequestMethod.GET)
    public List<Book> list(){
        return booksRepository.findAll();
    }


    @RequestMapping(value = "books", method = RequestMethod.POST)
    public Book create(@RequestBody Book book){
        return booksRepository.saveAndFlush(book);
    }


    @RequestMapping(value = "books/{id}", method = RequestMethod.GET)
    public Book get(@PathVariable Long id){
        return booksRepository.findOne(id);
    }

    @RequestMapping(value = "books/{author}", method = RequestMethod.POST)
    public List<Book> get(@PathVariable String author){
        return booksRepository.findBookByAuthor(author);
    }

    @RequestMapping(value = "booki/{author}", method = RequestMethod.POST)
    public Book getBook(@PathVariable String author){
        return booksRepository.findByAuthor(author);
    }


    @RequestMapping(value = "books/{id}", method = RequestMethod.PUT)
    public Book update(@PathVariable Long id, @RequestBody Book book){
        Book existingBook = booksRepository.findOne(id);
        BeanUtils.copyProperties(book, existingBook);
        return booksRepository.saveAndFlush(book);
    }

    @RequestMapping(value = "booka/{id}", method = RequestMethod.PUT)
    public Book updateName(@PathVariable Long id, @RequestBody String name){
        Book existingBook = booksRepository.findOne(id);
        existingBook.setName(name);
        return booksRepository.saveAndFlush(existingBook);
    }


    @RequestMapping(value = "books/{id}", method = RequestMethod.DELETE)
    public Book delete(@PathVariable Long id){
        Book existingBook = booksRepository.findOne(id);
        booksRepository.delete(existingBook);
        return existingBook;
    }



}
