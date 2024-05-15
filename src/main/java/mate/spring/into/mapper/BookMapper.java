package mate.spring.into.mapper;

import mate.spring.into.dto.BookDto;
import mate.spring.into.dto.CreateBookRequestDto;
import mate.spring.into.model.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public BookDto toDto(Book book) {
        BookDto dto = new BookDto();
        dto.setId(book.getId());
        dto.setIsbn(book.getIsbn());
        dto.setAuthor(book.getAuthor());
        dto.setPrice(book.getPrice());
        dto.setDescription(book.getDescription());
        dto.setTitle(book.getTitle());
        dto.setCoverImage(book.getCoverImage());
        return dto;
    }

    public Book toModel(CreateBookRequestDto requestDto) {
        Book book = new Book();
        book.setId(requestDto.getId());
        book.setAuthor(requestDto.getAuthor());
        book.setIsbn(requestDto.getIsbn());
        book.setPrice(requestDto.getPrice());
        book.setDescription(requestDto.getDescription());
        book.setTitle(requestDto.getTitle());
        book.setCoverImage(requestDto.getCoverImage());
        return book;
    }
}
