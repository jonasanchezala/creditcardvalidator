# Credit Card Validator(Payyo)

Este es el proyecto para resolver el taller practico de Java de la clase PICA de la especialización en arquitectura empresarial de software de la universidad Javeriana.

## Diagrama de componentes

El siguiente diagrama representa mediante componentes la comunicación de el servicio de ordenes con las pasarelas de pago.

![Diagrama de componentes](https://raw.githubusercontent.com/jonasanchezala/creditcardvalidator/master/images/componentes.png)

En este caso el micro servicio de ordenes esta compuesto por un modulo de servicios el cual tiene un archivo llamado `execute` el cual recibe la infomación de pago asignada y llama al respectivo cliente, en este caso `Payyo` o `Mock`
