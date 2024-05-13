package mate.spring.into.service;

import java.util.List;
import mate.spring.into.model.Book;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
