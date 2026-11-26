
import { PaymentFactory } from "../PaymentFactory";
import { PaymentProcessor } from "../../payment/PaymentProcessor";
import { PaymentValidator } from "../../payment/PaymentValidator";
import { PayPalValidator } from "../../payment/paymentImpl/PayPalValidator";
import { PayPalProcessor } from "../../payment/paymentImpl/PayPalProcessor";

export class PayPalFactory implements PaymentFactory {
    createPaymentProcessor(): PaymentProcessor {
        return new PayPalProcessor();
    }
    createPaymentValidator(): PaymentValidator {
        return new PayPalValidator();
    }
}