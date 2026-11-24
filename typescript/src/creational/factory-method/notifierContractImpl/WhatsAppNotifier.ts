import { Notifier } from "../notifierContract/Notifier";

export class WhatsAppNotifier implements Notifier {

    send(message: string): void {
        console.log(`Sending WhatsApp: ${message}`);
    }

}