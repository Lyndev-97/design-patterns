import { Notifier } from "../notifierContract/Notifier";

export class TelegramNotifier implements Notifier {

    send(message: string): void {
        console.log(`Sending Telegram: ${message}`);
    }

}