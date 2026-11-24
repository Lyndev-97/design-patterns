package com.creational.factoryMethod.factory.factoryImpl;

import com.creational.factoryMethod.notifierContract.Notifier;
import com.creational.factoryMethod.notifierContractImpl.SmsNotifier;
import com.creational.factoryMethod.factory.NotificationService;

public class SmsNotificationService extends NotificationService {

    @Override
    protected Notifier createNotifier() {
        return new SmsNotifier();
    }

}
