package co.edu.javeriana.tallerPica.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CreditCardValidate {

    @Id
    private String creditCardNumber;
    private String creditCardType;
}
