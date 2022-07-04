package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import in.ashokit.entity.Product;

/**
 * 
 * @author Bhubaneswar Behera @date 04-Jul-2022
 *
 */

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
