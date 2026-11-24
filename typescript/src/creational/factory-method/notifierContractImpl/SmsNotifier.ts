import { Notifier } from "../notifierContract/Notifier";

export class SmsNotifier implements Notifier {

    send(message: string): void {
        console.log(`Sending SMS: ${message}`);
    }

}