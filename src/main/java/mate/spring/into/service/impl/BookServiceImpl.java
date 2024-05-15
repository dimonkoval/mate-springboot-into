package mate.spring.into.service.impl;

import java.util.List;
import mate.spring.into.dto.BookDto;
import mate.spring.into.dto.CreateBookRequestDto;
import mate.spring.into.exception.EntityNotFoundException;
import mate.spring.into.mapper.BookMapper;
import mate.spring.into.model.Book;
import mate.spring.into.repository.BookRepository;
import mate.spring.into.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;
    private BookMapper bookMapper;

    public BookServiceImpl(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<BookDto> findAll() {
        return bookRepository.findAll()
                .stream()
                .map(bookMapper::toDto)
                .toList();
    }

    @Override
    public BookDto findById(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() ->
                        new EntityNotFoundException("Entity by ID " + id + " not found"));
        return bookMapper.toDto(book);
    }

    @Override
    public BookDto create(CreateBookRequestDto requestDto) {
        Book savedBook = bookRepository.save(bookMapper.toModel(requestDto));
        return bookMapper.toDto(savedBook);
    }
}
