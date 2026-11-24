import { Notifier } from "../notifierContract/Notifier";

export abstract class NotificationService {

    protected abstract createNotifier(): Notifier;

    sendNotification(message: string): void {

        const notifier = this.createNotifier();

        notifier.send(message);
    }

}