package com.creational.abstractFactory;

import com.creational.abstractFactory.factory.PaymentFactory;
import com.creational.abstractFactory.factory.fcyImpl.MercadoPagoFactory;
import com.creational.abstractFactory.factory.fcyImpl.PayPalFactory;
import com.creational.abstractFactory.payment.service.PaymentService;

public class Main {

    public static void main(String[] args) {

        // Using Mercado Pago
        PaymentFactory mercadoPagoFactory = new MercadoPagoFactory();

        PaymentService payment1 = new PaymentService(mercadoPagoFactory);

        payment1.pay(100);


        // Using PayPal
        PaymentFactory payPalFactory = new PayPalFactory();

        PaymentService payment2 = new PaymentService(payPalFactory);

        payment2.pay(200);

    }
}
