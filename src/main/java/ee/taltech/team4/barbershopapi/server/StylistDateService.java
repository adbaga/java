package ee.taltech.team4.barbershopapi.server;


import ee.taltech.team4.barbershopapi.model.Stylist;
import ee.taltech.team4.barbershopapi.model.StylistDate;
import ee.taltech.team4.barbershopapi.repository.StylistDateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StylistDateService {
    @Autowired
    StylistDateRepo stylistDateRepo;

    public List<StylistDate> getAllFreeDates() {
        List<StylistDate> listOfDates = stylistDateRepo.findAllDateByTaken();

//        List<String> dates = listOfDates.stream()
//                .map(d -> d.toString())
//                .collect(Collectors.toList());
//
        return listOfDates;
    }

    public boolean saveADate(Long id) {
        stylistDateRepo.saveADate(id);
        return true;
    }

}
