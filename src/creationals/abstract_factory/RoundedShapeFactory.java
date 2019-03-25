package creationals.abstract_factory;

import creationals.abstract_factory.impl.RoundedRectangle;
import creationals.abstract_factory.impl.RoundedSquare;

/**
 *
 * @author chamikara
 */
public class RoundedShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(Class<?> t) {
        if(t.equals(RoundedRectangle.class)){
            return new RoundedRectangle();
        } else if(t.equals(RoundedSquare.class)){
            return new RoundedSquare();
        }
        return null;
    }
    
}
