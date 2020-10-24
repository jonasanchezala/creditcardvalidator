package co.edu.javeriana.tallerPica.services;

import co.edu.javeriana.tallerPica.repositories.CreditCardRepository;
import co.edu.javeriana.tallerPica.wsdl.*;
import org.springframework.stereotype.Service;

@Service
public class ChargeCreditCardService {

    private final CreditCardRepository creditCardRepository;

    public ChargeCreditCardService(CreditCardRepository creditCardRepository) {
        this.creditCardRepository = creditCardRepository;
    }

    public ChargeCreditCardResponseElement chargeCreditCard(ChargeCreditCardElement chargeCreditCardElement) {

        ChargeCreditCardResponseElement chargeCreditCardResponseElement = new ObjectFactory().createChargeCreditCardResponseElement();

        boolean existsById = creditCardRepository.existsById(chargeCreditCardElement.getCc().getNumber());

        chargeCreditCardResponseElement.setResult(existsById);

        return chargeCreditCardResponseElement;
    }

    public VerifyCreditCardResponseElement verifyCreditCard(VerifyCreditCardElement verifyCreditCardElement) {

        VerifyCreditCardResponseElement verifyCreditCardResponseElement = new ObjectFactory().createVerifyCreditCardResponseElement();

        boolean existsById = creditCardRepository.existsById(verifyCreditCardElement.getCc().getNumber());

        verifyCreditCardResponseElement.setResult(existsById);

        return verifyCreditCardResponseElement;
    }
}
