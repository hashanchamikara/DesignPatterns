package creationals.prototype;

import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author chamikara
 */
public class ShapeCache {
    private static Map<String, Shape> shapeMap  = new Hashtable<String, Shape>();
    
    public static Shape getShape(String shapeId) {
      Shape cachedShape = shapeMap.get(shapeId);
        try {
            return (Shape) cachedShape.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return null;
   }
    
    // for each shape run database query and create shape
   // shapeMap.put(shapeKey, shape);
   // for example, we are adding three shapes
   
   public static void loadCache() {
      Circle circle = new Circle();
      circle.setId("1");
      shapeMap.put(circle.getId(),circle);

       Square square = new Square();
      square.setId("2");
      shapeMap.put(square.getId(),square);

      Rectangle rectangle = new Rectangle();
      rectangle.setId("3");
      shapeMap.put(rectangle.getId(), rectangle);
   }
}
