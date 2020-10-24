package co.edu.javeriana.tallerPica.controllers;

import co.edu.javeriana.tallerPica.services.ChargeCreditCardService;
import co.edu.javeriana.tallerPica.wsdl.ChargeCreditCardElement;
import co.edu.javeriana.tallerPica.wsdl.ChargeCreditCardResponseElement;
import co.edu.javeriana.tallerPica.wsdl.VerifyCreditCardElement;
import co.edu.javeriana.tallerPica.wsdl.VerifyCreditCardResponseElement;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/creditcard")
public class ChargeCreditCardController {

    private final ChargeCreditCardService chargeCreditCardService;

    public ChargeCreditCardController(ChargeCreditCardService chargeCreditCardService) {
        this.chargeCreditCardService = chargeCreditCardService;
    }

    @PostMapping("/chargeCreditCard")
    public ChargeCreditCardResponseElement chargeCreditCard(@RequestBody ChargeCreditCardElement chargeCreditCardElement){

        try {

            return chargeCreditCardService.chargeCreditCard(chargeCreditCardElement);

        }catch (NullPointerException ex){

            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage(), ex);

        }catch (Exception ex){

            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage(), ex);

        }
    }

    @PostMapping("/verifyCreditCard")
    public VerifyCreditCardResponseElement verifyCreditCard(@RequestBody VerifyCreditCardElement verifyCreditCardElement){

        try {

            return chargeCreditCardService.verifyCreditCard(verifyCreditCardElement);

        }catch (NullPointerException ex){

            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage(), ex);

        }catch (Exception ex){

            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage(), ex);

        }
    }

}
