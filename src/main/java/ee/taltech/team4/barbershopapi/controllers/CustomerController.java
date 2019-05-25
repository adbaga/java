package ee.taltech.team4.barbershopapi.controllers;

import ee.taltech.team4.barbershopapi.dto.DateAndService;
import ee.taltech.team4.barbershopapi.model.BarberShopServices;
import ee.taltech.team4.barbershopapi.model.Customer;
import ee.taltech.team4.barbershopapi.model.StylistDate;
import ee.taltech.team4.barbershopapi.server.CustomerService;
import ee.taltech.team4.barbershopapi.server.ShopServices;
import ee.taltech.team4.barbershopapi.server.StylistDateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private StylistDateService stylistDateService;
    @Autowired
    private CustomerService customerService;
//    private static final String FORMAT = "yyyy-MM-dd HH:mm:ss";
    @Autowired
    private ShopServices shopServices;

    @GetMapping
    public DateAndService getAllFreeDates() {
        List<StylistDate> stylistDateList = stylistDateService.getAllFreeDates();
        List<BarberShopServices> barberShopServicesList = shopServices.showAllService();

        DateAndService dateAndService = new DateAndService(stylistDateList,barberShopServicesList);

        return dateAndService;
    }


    @PostMapping("{id}")
    public boolean bookADate(@PathVariable Long id , @RequestBody Customer customer) {
        stylistDateService.saveADate(id);
        customer.setStylistDateID(id);
        customerService.saveCustomer(customer);
        return true;
    }

}
