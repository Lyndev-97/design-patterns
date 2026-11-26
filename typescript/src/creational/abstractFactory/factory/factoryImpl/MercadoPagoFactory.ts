import { PaymentFactory } from "../PaymentFactory";
import { PaymentProcessor } from "../../payment/PaymentProcessor";
import { PaymentValidator } from "../../payment/PaymentValidator";
import { MercadoPagoProcessor } from "../../payment/paymentImpl/MercadoPagoProcessor";
import { MercadoPagoValidator } from "../../payment/paymentImpl/MercadoPagoValidator";

export class MercadoPagoFactory implements PaymentFactory {
    createPaymentProcessor(): PaymentProcessor {
        return new MercadoPagoProcessor();
    }
    createPaymentValidator(): PaymentValidator {
        return new MercadoPagoValidator();
    }
}