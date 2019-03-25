package creationals.abstract_factory.impl;

import creationals.abstract_factory.Shape;

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
