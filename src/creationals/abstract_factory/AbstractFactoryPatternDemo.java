package creationals.abstract_factory;

import creationals.abstract_factory.impl.RoundedSquare;
import creationals.abstract_factory.impl.Square;

/**
 *
 * @author chamikara
 */
public class AbstractFactoryPatternDemo {
    
    public static void main(String[] args) {
        
        // get ShapeFactory from producer
        AbstractFactory shapeFactory = FactoryProducer.getFactory(ShapeFactory.class);
        
        Shape squre = shapeFactory.getShape(Square.class);
        squre.draw(); // draw squre
        
        // get RoundedShapeFactory from producer
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(RoundedShapeFactory.class);
        
        Shape roundedSqure = roundedShapeFactory.getShape(RoundedSquare.class);
        roundedSqure.draw(); // draw rounded squre 
    }
    
}
