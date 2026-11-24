import { NotificationService } from "../NotificationService";
import { Notifier } from "../../notifierContract/Notifier";
import { WhatsAppNotifier } from "../../notifierContractImpl/WhatsAppNotifier";

export class WhatsAppNotificationService extends NotificationService {

    protected createNotifier(): Notifier {
        return new WhatsAppNotifier();
    }

}