package springdata;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertNotNull;

public class CustomerRepositoryTest extends AbstractRepositoryTest{
    @Autowired
    CustomerRepository customerRepository;

    @Before
    public void save() throws Exception{
        Customer customer = new Customer();
        customer.setId("1234");
        customer.setName("zhang shan");
        customerRepository.save(customer);
        assertNotNull(customer.getId());
    }

    @Test
    public void test() throws Exception{
        System.err.println(customerRepository);
        System.err.println(customerRepository.getByName("zhang shan").getId());
    }
}
