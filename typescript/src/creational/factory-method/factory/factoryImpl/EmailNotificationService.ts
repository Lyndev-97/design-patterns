import { NotificationService } from "../NotificationService";
import { Notifier } from "../../notifierContract/Notifier";
import { EmailNotifier } from "../../notifierContractImpl/EmailNotifier";

export class EmailNotificationService extends NotificationService {

    protected createNotifier(): Notifier {
        return new EmailNotifier();
    }

}