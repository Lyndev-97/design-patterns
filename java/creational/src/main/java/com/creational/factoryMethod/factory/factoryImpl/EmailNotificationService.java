package com.creational.factoryMethod.factory.factoryImpl;

import com.creational.factoryMethod.notifierContract.Notifier;
import com.creational.factoryMethod.notifierContractImpl.EmailNotifier;
import com.creational.factoryMethod.factory.NotificationService;

public class EmailNotificationService extends NotificationService {

    @Override
    protected Notifier createNotifier() {
        return new EmailNotifier();
    }
}
