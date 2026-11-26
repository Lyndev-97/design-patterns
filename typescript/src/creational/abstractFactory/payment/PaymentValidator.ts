export interface PaymentValidator {
    validate(amount: number): boolean;
}