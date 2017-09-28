package springdata;

/**
 * Created by HL on 17/9/20.
 */

import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer,String> {

    public Customer getByName(String name);


}
