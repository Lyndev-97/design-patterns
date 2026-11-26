
import { PaymentValidator } from "../PaymentValidator";

export class PayPalValidator implements PaymentValidator {
    validate(amount: number): boolean {
        if (amount <= 0) {
            console.log("Invalid payment amount for PayPal");
            return false;
        }
        console.log(`Processing payment via PayPal: ${amount}`);
        return true;
    }
}