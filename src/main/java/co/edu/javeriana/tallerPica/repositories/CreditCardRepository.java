package co.edu.javeriana.tallerPica.repositories;

import co.edu.javeriana.tallerPica.models.CreditCardValidate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends CrudRepository<CreditCardValidate, String> {
}

