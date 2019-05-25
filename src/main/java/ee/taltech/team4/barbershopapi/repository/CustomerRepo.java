/*
 * Database of customers.
 */

package ee.taltech.team4.barbershopapi.repository;

import ee.taltech.team4.barbershopapi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>  {

}
