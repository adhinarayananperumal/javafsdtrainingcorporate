package citibank.reduxcode.repo;

import org.springframework.data.repository.CrudRepository;

import citibank.reduxcode.controller.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
