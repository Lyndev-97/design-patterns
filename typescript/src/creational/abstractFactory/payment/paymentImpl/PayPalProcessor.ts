
import { PaymentProcessor } from "../PaymentProcessor";

export class PayPalProcessor implements PaymentProcessor {
    process(price: number): void {
        console.log(`Processing payment of ${price} via PayPal`);
    }
}