package creationals.builder.impl;

import creationals.builder.Burger;

/**
 *
 * @author chamikara
 */
public class ChickenBurger extends Burger{

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50f;
    }
    
}
