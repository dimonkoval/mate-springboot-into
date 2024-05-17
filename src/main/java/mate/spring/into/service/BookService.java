package mate.spring.into.service;

import java.util.List;
import mate.spring.into.dto.BookDto;
import mate.spring.into.dto.CreateBookRequestDto;
import mate.spring.into.model.Book;

public interface BookService {
    Book save(Book book);

    List<BookDto> findAll();

    BookDto findById(Long id);

    BookDto create(CreateBookRequestDto requestDto);
}
