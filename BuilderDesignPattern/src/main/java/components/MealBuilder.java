package components;

public class MealBuilder {
  public Meal prepareVegMeal() {
    Meal meal = new Meal();
    meal.addItem(new VegBurger())
            .addItem(new Coke())
            .addItem(new Pepsi());
    return meal;
  }

  public Meal prepareNonVegMeal() {
    Meal meal = new Meal();
    meal.addItem(new ChickenBurger());
    meal.addItem(new Pepsi());
    return meal;
  }
}
