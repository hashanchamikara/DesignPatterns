package creationals.abstract_factory.impl;

import creationals.abstract_factory.Shape;

/**
 *
 * @author chamikara
 */
public class RoundedRectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Draw Rounded Rectangle");
    }
    
}
