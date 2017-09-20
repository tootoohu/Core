package data;

/**
 * Created by HL on 17/9/20.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Transactional
    public Customer getByName(String name){
        return CustomerRepository.getByName(name);
    }

}
