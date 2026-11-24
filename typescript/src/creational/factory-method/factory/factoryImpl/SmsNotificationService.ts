import { NotificationService } from "../NotificationService";
import { Notifier } from "../../notifierContract/Notifier";
import { SmsNotifier } from "../../notifierContractImpl/SmsNotifier";

export class SmsNotificationService extends NotificationService {

    protected createNotifier(): Notifier {
        return new SmsNotifier();
    }

}