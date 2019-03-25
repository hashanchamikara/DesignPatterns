package creationals.factory.impl;

import creationals.factory.Shape;

/**
 *
 * @author chamikara
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
    
}
