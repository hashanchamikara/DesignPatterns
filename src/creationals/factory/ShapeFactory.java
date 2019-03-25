package creationals.factory;

import creationals.factory.impl.Circle;
import creationals.factory.impl.Rectangle;
import creationals.factory.impl.Square;

/**
 *
 * @author chamikara
 */
public class ShapeFactory {

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
