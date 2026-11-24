package com.creational.factoryMethod.notifierContractImpl;

import com.creational.factoryMethod.notifierContract.Notifier;

public class SmsNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
