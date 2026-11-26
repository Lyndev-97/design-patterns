package com.creational.abstractFactory.payment.paymentImpl;

import com.creational.abstractFactory.payment.PaymentProcessor;

public class MercadoPagoProcessor implements PaymentProcessor {
    @Override
    public void process(double price) {
        System.out.println("Processing payment via Mercado Pago: " + price);
    }
}
