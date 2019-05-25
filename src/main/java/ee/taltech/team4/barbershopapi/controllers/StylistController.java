package ee.taltech.team4.barbershopapi.controllers;

import ee.taltech.team4.barbershopapi.model.Stylist;
import ee.taltech.team4.barbershopapi.server.StylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stylist")
public class StylistController {
    @Autowired
    private StylistService stylistService;

    @GetMapping
    public List<Stylist> showAllService() {
        return stylistService.showAllStylist();
    }

    @PostMapping
    public boolean addStylist(@RequestBody Stylist stylist) {
        return stylistService.addStylist(stylist);
    }
    @PutMapping("{id}")
    public boolean updateStylist(@PathVariable Long id, @RequestBody Stylist stylist) {
        return stylistService.updateStylist(id,stylist);
    }

    @DeleteMapping("{id}")
    public boolean deleteStylist(@PathVariable Long id) {
        return stylistService.delteStylist(id);
    }
}
