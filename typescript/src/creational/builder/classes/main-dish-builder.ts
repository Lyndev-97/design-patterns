import { MealBuilderProtocol } from "../interfaces/meal-builder-protocol";
import { MealBox } from "./meal-box";
import { Rice, Beans, Meat, Salad, Beverage, Dessert } from "./meals";

export class MainDishBuilder implements MealBuilderProtocol {
    
    private _meal: MealBox = new MealBox();

    reset(): this {
        this._meal = new MealBox();
        return this;
    }
    
    makeMeal(): this {
        const rice = new Rice("Rice", 10);
        const beans = new Beans("Beans", 15);
        const meat = new Meat("Meat", 30);
        const salad = new Salad("Salad", 20);

        this._meal.add(rice, beans, meat, salad);

        return this;
    }
    makeBeverage(): this {
        const beverage = new Beverage("Bebida", 5);
        this._meal.add(beverage);
        return this;
    }

    makeDessert(): this {
    const dessert = new Dessert("Pudim", 5);
        this._meal.add(dessert);
        return this;
    }

    getMeal(): MealBox {
        return this._meal;
    }
    
    getPrice(): number {
        return this._meal.getPrice();
    }
}