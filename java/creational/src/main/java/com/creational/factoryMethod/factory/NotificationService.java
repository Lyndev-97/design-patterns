package com.creational.factoryMethod.factory;

import com.creational.factoryMethod.notifierContract.Notifier;

public abstract class NotificationService {

    protected abstract Notifier createNotifier();

    public void sendNotification(String message) {

        Notifier notifier = createNotifier();

        notifier.send(message);
    }
}
