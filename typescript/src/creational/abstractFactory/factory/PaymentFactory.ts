
import { PaymentProcessor } from "../payment/PaymentProcessor";
import { PaymentValidator } from "../payment/PaymentValidator";

export interface PaymentFactory {
    createPaymentProcessor(): PaymentProcessor;
    createPaymentValidator(): PaymentValidator;
}