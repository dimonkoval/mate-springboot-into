package mate.spring.into.mapper;

import mate.spring.into.config.MapperConfig;
import mate.spring.into.dto.BookDto;
import mate.spring.into.dto.CreateBookRequestDto;
import mate.spring.into.model.Book;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface BookMapper {

    BookDto toDto(Book book);

    Book toModel(CreateBookRequestDto requestDto);
}
