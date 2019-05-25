package ee.taltech.team4.barbershopapi.repository;

import ee.taltech.team4.barbershopapi.model.Stylist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StylistRepo extends JpaRepository<Stylist,Long> {
}
