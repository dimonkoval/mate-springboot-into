package mate.spring.into.service.impl;

import java.util.List;
import mate.spring.into.model.Book;
import mate.spring.into.repository.BookRepository;
import mate.spring.into.service.BookService;

public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
