package com.creational.abstractFactory.payment.paymentImpl;

import com.creational.abstractFactory.payment.PaymentValidator;

public class MercadoPagoValidator implements PaymentValidator {
    @Override
    public boolean validate(double amount) {
        System.out.println(
                "Validating payment via Mercado Pago"
        );

        return amount > 0;
    }
}
