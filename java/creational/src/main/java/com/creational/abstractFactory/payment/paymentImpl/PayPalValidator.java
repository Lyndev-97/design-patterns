package com.creational.abstractFactory.payment.paymentImpl;

import com.creational.abstractFactory.payment.PaymentValidator;

public class PayPalValidator implements PaymentValidator {
    @Override
    public boolean validate(double amount) {
        System.out.println(
                "Validating payment via PayPal"
        );

        return amount > 0;
    }
}
