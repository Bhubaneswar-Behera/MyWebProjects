package in.ashokit.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import in.ashokit.entity.Book;

/**
 * 
 * @author Bhubaneswar Behera @date 01-Aug-2022
 *
 */

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
