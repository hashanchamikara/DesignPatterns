package creationals.builder;

import creationals.builder.impl.ChickenBurger;
import creationals.builder.impl.Coke;
import creationals.builder.impl.Pepsi;
import creationals.builder.impl.VegBurger;

/**
 *
 * @author chamikara
 */
public class MealBuilder {
    
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
    
    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
