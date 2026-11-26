import { PaymentFactory } from "../../factory/PaymentFactory";
import { PaymentProcessor } from "../PaymentProcessor";
import { PaymentValidator } from "../PaymentValidator";

export class PaymentService {
    private paymentProcessor: PaymentProcessor;
    private paymentValidator: PaymentValidator;

    constructor(factory: PaymentFactory) {
        this.paymentProcessor = factory.createPaymentProcessor();
        this.paymentValidator = factory.createPaymentValidator();
    }

    pay(amount: number): void {
        if (this.paymentValidator.validate(amount)) {
            this.paymentProcessor.process(amount);
        } else {
            console.log("Payment validation failed.");
        }
    }
}