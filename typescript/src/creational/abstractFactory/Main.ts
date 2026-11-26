import { MercadoPagoFactory } from "./factory/factoryImpl/MercadoPagoFactory";
import { PayPalFactory } from "./factory/factoryImpl/PayPalFactory";
import { PaymentFactory } from "./factory/PaymentFactory";
import { PaymentService } from "./payment/service/PaymentService";

function main(): void {

    // Using Mercado Pago
    const mercadoPagoFactory: PaymentFactory = new MercadoPagoFactory();
    const payment1: PaymentService = new PaymentService(mercadoPagoFactory);

    payment1.pay(100);

    //Using PayPal
    const payPalFactory: PaymentFactory = new PayPalFactory();
    const payment2: PaymentService = new PaymentService(payPalFactory);
    payment2.pay(200);

}

main();