package data;

/**
 * Created by HL on 17/9/20.
 */

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository {

    public Customer getByName(String name);


}
