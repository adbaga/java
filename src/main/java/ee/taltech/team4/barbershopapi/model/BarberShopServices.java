/*
 * This class contains what services the barbershop provides.
 * Each service like haircut, shave, (haircut+shave) etc has a unique id, name and a price.
 * Each service is its own object!
 */

package ee.taltech.team4.barbershopapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//Service = List of services provided by the shop!

@Entity
@NoArgsConstructor
public class BarberShopServices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long serviceID;

    @Getter
    @Setter
    @Column(length = 30)
    private String serviceName;

    @Getter
    @Setter
    private Double price;

    public BarberShopServices(String serviceName, Double price) {
        this.serviceName = serviceName;
        this.price = price;
    }
}
