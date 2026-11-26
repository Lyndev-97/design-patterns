export interface PaymentProcessor {

    process(price: number): void;
}