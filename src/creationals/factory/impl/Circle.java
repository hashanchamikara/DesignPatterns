package creationals.factory.impl;

import creationals.factory.Shape;

/**
 *
 * @author chamikara
 */
public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
    
}
