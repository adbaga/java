package ee.taltech.team4.barbershopapi.dto;

import ee.taltech.team4.barbershopapi.model.BarberShopServices;
import ee.taltech.team4.barbershopapi.model.Customer;
import ee.taltech.team4.barbershopapi.model.Stylist;
import ee.taltech.team4.barbershopapi.model.StylistDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class DateAndService {

    @Autowired
    @Getter
    @Setter
    private List<StylistDate> stylistDatesList;
    @Autowired
    @Getter
    @Setter
    private List<BarberShopServices> barberShopServicesList;
}
