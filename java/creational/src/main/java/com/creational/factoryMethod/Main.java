package com.creational.factoryMethod;

import com.creational.factoryMethod.factory.NotificationService;
import com.creational.factoryMethod.factory.factoryImpl.EmailNotificationService;
import com.creational.factoryMethod.factory.factoryImpl.WhatsAppNotificationService;

public class Main {
    public static void main(String[] args) {

        NotificationService service = new WhatsAppNotificationService();

        service.sendNotification("Your order has been confirmed!");

    }
}
