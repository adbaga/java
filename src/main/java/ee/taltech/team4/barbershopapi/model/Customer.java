/*
 * Customer object, contains the name of the customer, and his phone number to uniquely identify the customer.
 * The customer's stylist is identified by stylistId the service he chooses is the productID;
 * Each customer is its own object!
 */

package ee.taltech.team4.barbershopapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long customerID;

    @Getter
    @Setter
    @Column(length = 30)
    private String firstName;

    @Getter
    @Setter
    @Column(length = 30)
    private String lastName;

    @Getter
    @Setter
    private Long phoneNum;

    @Getter
    @Setter
    private Long stylistDateID;

    @Getter
    @Setter
    private Long serviceID;

    public Customer(String firstName, String lastName, Long phoneNum, Long stylistDateID, Long serviceID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.serviceID = serviceID;
        this.stylistDateID = stylistDateID;
    }

}
