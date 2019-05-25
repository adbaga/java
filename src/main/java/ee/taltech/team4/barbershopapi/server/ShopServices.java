package ee.taltech.team4.barbershopapi.server;



import ee.taltech.team4.barbershopapi.model.BarberShopServices;
import ee.taltech.team4.barbershopapi.repository.BarberShopServicesRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ShopServices {
    @Autowired
    private BarberShopServicesRepo barberShopServicesRepo;

    public List<BarberShopServices> showAllService() {
        return barberShopServicesRepo.findAll();
    }

    /*
     * By default save method matches the id of the parameter object, if it is null or the id is something new,
     * Then it inserts into the database.
     * Otherwise, if the id matches with an existing entry, it simply overwrites the old object with new data.
     */
    public boolean addService(BarberShopServices service) {
        service.setServiceID(null);
        barberShopServicesRepo.save(service);
        return true;
    }
    public boolean deleteService(Long id) {
        barberShopServicesRepo.deleteById(id);
        return true;
    }

    public boolean updateService(Long id, BarberShopServices service) {
        service.setServiceID(id);
        barberShopServicesRepo.save(service);
        return true;
    }

}

