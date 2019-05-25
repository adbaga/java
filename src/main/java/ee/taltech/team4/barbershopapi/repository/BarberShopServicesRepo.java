package ee.taltech.team4.barbershopapi.repository;

import ee.taltech.team4.barbershopapi.model.BarberShopServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarberShopServicesRepo extends JpaRepository<BarberShopServices, Long> {

}
