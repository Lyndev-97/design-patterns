package com.creational.abstractFactory.factory.fcyImpl;

import com.creational.abstractFactory.factory.PaymentFactory;
import com.creational.abstractFactory.payment.PaymentProcessor;
import com.creational.abstractFactory.payment.PaymentValidator;
import com.creational.abstractFactory.payment.paymentImpl.PayPalProcessor;
import com.creational.abstractFactory.payment.paymentImpl.PayPalValidator;

public class PayPalFactory implements PaymentFactory {

    @Override
    public PaymentProcessor createProcessor() {
        return new PayPalProcessor();
    }

    @Override
    public PaymentValidator createValidator() {
        return new PayPalValidator();
    }
}
