package com.creational.factoryMethod.notifierContractImpl;

import com.creational.factoryMethod.notifierContract.Notifier;

public class WhatsAppNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Sending WhatsApp message: " + message);
    }
}
