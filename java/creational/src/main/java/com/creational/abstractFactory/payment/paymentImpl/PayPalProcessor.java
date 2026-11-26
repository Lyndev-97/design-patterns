package com.creational.abstractFactory.payment.paymentImpl;

import com.creational.abstractFactory.payment.PaymentProcessor;

public class PayPalProcessor implements PaymentProcessor {

    @Override
    public void process(double valor) {
        System.out.println(
                "Processing payment via PayPal: " + valor
        );
    }
}
