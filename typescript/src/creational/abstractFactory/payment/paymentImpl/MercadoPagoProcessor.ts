
import { PaymentProcessor } from "../PaymentProcessor";

export class MercadoPagoProcessor implements PaymentProcessor {
    process(price: number): void {
        console.log(`Processing payment of ${price} via Mercado Pago`);

    }
}