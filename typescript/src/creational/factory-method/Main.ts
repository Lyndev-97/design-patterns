import { NotificationService } from "./factory/NotificationService";
import { EmailNotificationService } from "./factory/factoryImpl/EmailNotificationService";
import { SmsNotificationService } from "./factory/factoryImpl/SmsNotificationService";
import { TelegramNotificationService } from "./factory/factoryImpl/TelegramNotificationService";
import { WhatsAppNotificationService } from "./factory/factoryImpl/WhatsAppNotificationService";

function main(): void {

    const emailService: NotificationService = new EmailNotificationService();
    emailService.sendNotification("Your order has been confirmed!");
    /*
        const smsService: NotificationService = new SmsNotificationService();
        smsService.sendNotification("Order Shipped!");
    
        const telegramService: NotificationService = new TelegramNotificationService();
        telegramService.sendNotification("Order is on the way!");
    
        const whatsappService: NotificationService = new WhatsAppNotificationService();
        whatsappService.sendNotification("Order delivered!");
    */
}

main();