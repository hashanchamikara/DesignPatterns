package creationals.abstract_factory;

import creationals.abstract_factory.impl.Circle;
import creationals.abstract_factory.impl.Rectangle;
import creationals.abstract_factory.impl.Square;

/**
 *
 * @author chamikara
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(Class<?> t){
        if(t.equals(Circle.class)){
            return new Circle();
        }
        else if(t.equals(Rectangle.class)){
            return new Rectangle();
        }
        else if(t.equals(Square.class)){
            return new Square();
        } else {
            return null;
        }
    }
}
