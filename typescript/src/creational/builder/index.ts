import { MainDishBuilder } from "./classes/main-dish-builder";
import { VeganDishBuilder } from "./classes/vegan-dish-builder";
//import { MealBox } from "./classes/meal-box";
//import { Rice, Beans, Meat, Salad, Beverage, Dessert } from "./classes/meals";
/*
const rice = new Rice("Rice", 10);
const beans = new Beans("Beans", 15);
const meat = new Meat("Meat", 30);
const salad = new Salad("Salad", 20);
const beverage = new Beverage("Beverage", 5);
const dessert = new Dessert("Dessert", 10);

const mealBox = new MealBox();
mealBox.add(rice, beans, meat, salad, beverage, dessert);

console.log(`Total price: ${mealBox.getPrice()}`);
console.log(mealBox);
*/

const mainDishBuilder = new MainDishBuilder();
mainDishBuilder.makeMeal().makeBeverage().makeDessert();
console.log(mainDishBuilder.getMeal());
console.log(mainDishBuilder.getPrice());

mainDishBuilder.reset();
const meal2 = mainDishBuilder.makeMeal().getMeal();
console.log(meal2);
console.log(mainDishBuilder.getPrice());


const veganDishBuilder = new VeganDishBuilder();
const veganMeal = veganDishBuilder.makeMeal().getMeal();
console.log(veganMeal);
console.log(veganDishBuilder.getPrice());