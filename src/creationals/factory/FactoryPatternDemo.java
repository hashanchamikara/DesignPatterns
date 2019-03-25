package creationals.factory;

import creationals.factory.impl.Circle;
import creationals.factory.impl.Rectangle;
import creationals.factory.impl.Square;

/**
 *
 * @author chamikara
 */
public class FactoryPatternDemo {
    
    public static void main(String[] args) {
        // initialize Shape Factory
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape circle = shapeFactory.getShape(Circle.class);
        circle.draw(); // Draw Circle
        
        Shape square = shapeFactory.getShape(Square.class);
        square.draw(); // Draw Square
        
        Shape rectangle = shapeFactory.getShape(Rectangle.class);
        rectangle.draw(); // Draw Rectangle
        
    }
    
}
