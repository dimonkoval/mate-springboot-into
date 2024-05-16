package mate.spring.into.repository;

import java.util.List;
import java.util.Optional;
import mate.spring.into.model.Book;
import org.springframework.stereotype.Repository;

//@Repository
public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();

    Optional<Book> findById(Long id);
}
