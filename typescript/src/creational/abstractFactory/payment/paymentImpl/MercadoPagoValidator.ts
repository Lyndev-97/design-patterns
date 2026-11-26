
import { PaymentValidator } from "../PaymentValidator";

export class MercadoPagoValidator implements PaymentValidator {
    validate(amount: number): boolean {
        if (amount <= 0) {
            console.log("Invalid payment amount for Mercado Pago");
            return false;
        }
        console.log("Payment details validated for Mercado Pago");
        return true;
    }
}