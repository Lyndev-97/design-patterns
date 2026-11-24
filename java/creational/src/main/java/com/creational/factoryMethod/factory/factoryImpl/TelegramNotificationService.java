package com.creational.factoryMethod.factory.factoryImpl;

import com.creational.factoryMethod.notifierContract.Notifier;
import com.creational.factoryMethod.notifierContractImpl.TelegramNotifier;
import com.creational.factoryMethod.factory.NotificationService;

public class TelegramNotificationService extends NotificationService {
    @Override
    protected Notifier createNotifier() {
        return new TelegramNotifier();
    }
}
