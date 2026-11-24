import { Notifier } from "../notifierContract/Notifier";

export class EmailNotifier implements Notifier {

    send(message: string): void {
        console.log(`Sending email: ${message}`);
    }

}