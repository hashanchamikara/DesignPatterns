package creationals.builder;

import creationals.builder.Item;
import creationals.builder.Packing;
import creationals.builder.impl.Wrapper;

/**
 *
 * @author chamikara
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
    

}
