package creationals.builder.impl;

import creationals.builder.CoolDrink;

/**
 *
 * @author chamikara
 */
public class Pepsi extends CoolDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35;
    }
    
}
