/*
 * This class contains info about the the stylist (admin) of the barbershop.
 * A stylist has his own id, name and the dates he has selected to work in.
 * Each stylist has his own object!
 */

package ee.taltech.team4.barbershopapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Stylist {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Getter
    @Setter
    private Long stylistID;

    @Getter
    @Setter
    @Column(length = 60)
    private String name;
//    @Getter @Setter private Long dateId;


    public Stylist(String name) {
        this.name = name;
    }
}
