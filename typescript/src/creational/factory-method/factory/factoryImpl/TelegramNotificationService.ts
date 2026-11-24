import { NotificationService } from "../NotificationService";
import { Notifier } from "../../notifierContract/Notifier";
import { TelegramNotifier } from "../../notifierContractImpl/TelegramNotifier";

export class TelegramNotificationService extends NotificationService {

    protected createNotifier(): Notifier {
        return new TelegramNotifier();
    }

}