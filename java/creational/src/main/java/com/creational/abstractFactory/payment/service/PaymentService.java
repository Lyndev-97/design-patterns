package com.creational.abstractFactory.payment.service;

import com.creational.abstractFactory.factory.PaymentFactory;
import com.creational.abstractFactory.payment.PaymentProcessor;
import com.creational.abstractFactory.payment.PaymentValidator;

public class PaymentService {

    private final PaymentProcessor processor;
    private final PaymentValidator validator;

    public PaymentService(PaymentFactory factory) {

        this.processor = factory.createProcessor();
        this.validator = factory.createValidator();

    }

    public void pay(double amount) {

        if (validator.validate(amount)) {
            processor.process(amount);
        }

    }
}
