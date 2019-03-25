package creationals.factory.impl;

import creationals.factory.Shape;

/**
 *
 * @author chamikara
 */
public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
    
}
