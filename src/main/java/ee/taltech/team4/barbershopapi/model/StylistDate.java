/*
 * This class has information about which stylist is wokring at what day and time.
 * Each day/time (or time slot) is its own object!
 */

package ee.taltech.team4.barbershopapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class StylistDate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long stylistDateID;

    @Getter
    @Setter
    private Long stylistID;

    @Getter
    @Setter
    private LocalDateTime date;

    @Getter
    @Setter
    private boolean isTaken;

    public StylistDate(Long stylistId, LocalDateTime date, boolean isTaken) {
        this(stylistId,date);
        this.isTaken = isTaken;
    }

    public StylistDate(Long stylistId, LocalDateTime date) {
        this.stylistID = stylistId;
        this.date = date;
    }

}
