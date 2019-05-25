package ee.taltech.team4.barbershopapi.controllers;

import ee.taltech.team4.barbershopapi.model.BarberShopServices;
import ee.taltech.team4.barbershopapi.server.ShopServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    private ShopServices barberService;

    @GetMapping
    public List<BarberShopServices> showAllService() {
        return barberService.showAllService();
    }

    @PostMapping
    public boolean addService(@RequestBody BarberShopServices service) {
        return barberService.addService(service);
    }

    @DeleteMapping("{id}")
    public boolean deleteService(@PathVariable Long id) {
        return barberService.deleteService(id);
    }

    /*
     * The url should contain the id of the old object (the one to be updated)
     * and the request body should contain new data.
     */
    @PutMapping("{id}")
    public boolean updateService(@PathVariable Long id, @RequestBody BarberShopServices service) {
        return barberService.updateService(id, service);
    }

}
