package com.creational.abstractFactory.factory;

import com.creational.abstractFactory.payment.PaymentProcessor;
import com.creational.abstractFactory.payment.PaymentValidator;

public interface PaymentFactory {
    PaymentProcessor createProcessor();

    PaymentValidator createValidator();
}
