package creationals.abstract_factory;

/**
 *
 * @author chamikara
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(Class<?> t){
        if(t.equals(RoundedShapeFactory.class)){
            return new RoundedShapeFactory();
        } else if(t.equals(ShapeFactory.class)){
            return new ShapeFactory();
        }
        return  null;
    }
    
}
