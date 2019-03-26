package creationals.builder;

import creationals.builder.Item;
import creationals.builder.Packing;
import creationals.builder.impl.Bottle;

/**
 *
 * @author chamikara
 */
public abstract class CoolDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }
    
    
}
