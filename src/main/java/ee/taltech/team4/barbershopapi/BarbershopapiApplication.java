package ee.taltech.team4.barbershopapi;

import ee.taltech.team4.barbershopapi.model.StylistDate;
import ee.taltech.team4.barbershopapi.repository.StylistDateRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class BarbershopapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BarbershopapiApplication.class, args);
    }

    @Bean
    public CommandLineRunner init (StylistDateRepo stylistDateRepo) {
        return args -> {
            LocalDateTime date1 = LocalDateTime.of(2019,2,14,12,0);
            LocalDateTime date2 = LocalDateTime.of(2019,2,14,9,0);
            LocalDateTime date3 = LocalDateTime.of(2019,2,14,8,0);
            LocalDateTime date4 = LocalDateTime.of(2019,2,14,14,0);

//            Timestamp timestamp = new Timestamp(2019,02,14,13,00);

            stylistDateRepo.save( new StylistDate((long) 3,date1, false));
            stylistDateRepo.save(new StylistDate((long) 1,date2, false));
            stylistDateRepo.save(new StylistDate((long) 2,date3, true));
            stylistDateRepo.save(new StylistDate((long) 1,date4, false));
        };
    }

}
