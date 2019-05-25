package ee.taltech.team4.barbershopapi.repository;

import ee.taltech.team4.barbershopapi.model.StylistDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StylistDateRepo extends JpaRepository<StylistDate, Long> {

    @Query(value = "SELECT * FROM StylistDate SD WHERE SD.isTaken = false ", nativeQuery = true)
    List<StylistDate> findAllDateByTaken();

    @Modifying
    @Transactional
    @Query(value = "UPDATE StylistDate SET isTaken = true WHERE stylistDateID = :id", nativeQuery = true)
    void saveADate(@Param("id") Long id);

}
