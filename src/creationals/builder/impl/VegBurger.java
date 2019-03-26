package creationals.builder.impl;

import creationals.builder.Burger;

/**
 *
 * @author chamikara
 */
public class VegBurger extends Burger{

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25f;
    }
    
}
