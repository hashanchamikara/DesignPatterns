package creationals.builder.impl;

import creationals.builder.CoolDrink;

/**
 *
 * @author chamikara
 */
public class Coke extends CoolDrink{

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30f;
    }
    
}
