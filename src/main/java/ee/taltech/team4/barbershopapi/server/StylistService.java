package ee.taltech.team4.barbershopapi.server;

import ee.taltech.team4.barbershopapi.model.Stylist;
import ee.taltech.team4.barbershopapi.repository.StylistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StylistService {
    @Autowired
    private StylistRepo stylistRepo;

    public List<Stylist> showAllStylist() {
        return stylistRepo.findAll();
    }

    public boolean addStylist(Stylist stylist) {
        stylist.setStylistID();
        stylistRepo.save(stylist);
        return true;
    }

    public boolean updateStylist(Long id, Stylist stylist) {
        stylist.setStylistID(id);
        stylistRepo.save(stylist);
        return true;
    }

    public boolean delteStylist(Long id) {
        stylistRepo.deleteById(id);
        return true;
    }
}
