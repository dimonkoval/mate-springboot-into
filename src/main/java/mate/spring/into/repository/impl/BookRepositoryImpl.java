package mate.spring.into.repository.impl;

import java.util.List;
import mate.spring.into.model.Book;
import mate.spring.into.repository.BookRepository;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImpl implements BookRepository {
    @Override
    public Book save(Book book) {
        return null;
    }

    @Override
    public List<Book> findAll() {
        return null;
    }
}
