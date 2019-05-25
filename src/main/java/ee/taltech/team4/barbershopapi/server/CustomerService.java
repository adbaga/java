package ee.taltech.team4.barbershopapi.server;

import ee.taltech.team4.barbershopapi.model.Customer;
import ee.taltech.team4.barbershopapi.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired CustomerRepo customerRepo;

    public boolean saveCustomer(Customer customer) {
        customerRepo.save(customer);
        return true;
    }
}
