package com.creational.abstractFactory.factory.fcyImpl;

import com.creational.abstractFactory.factory.PaymentFactory;
import com.creational.abstractFactory.payment.PaymentProcessor;
import com.creational.abstractFactory.payment.PaymentValidator;
import com.creational.abstractFactory.payment.paymentImpl.MercadoPagoValidator;
import com.creational.abstractFactory.payment.paymentImpl.MercadoPagoProcessor;

public class MercadoPagoFactory implements PaymentFactory {

    @Override
    public PaymentProcessor createProcessor() {
        return new MercadoPagoProcessor();
    }

    @Override
    public PaymentValidator createValidator() {
        return new MercadoPagoValidator();
    }
}
