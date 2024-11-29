
package Interfaces;

import java.util.Map;


public interface DrawingEngine {
    //Manage shapes Objects 
    public void addShape(Shape shape);
    public void removeShape(Shape shape);
    public void moveShape(Shape shape,Map<String, Double> properties);
    public void resizeShape(Shape shape,Map<String, Double> properties);
    //return the created shapes objects
    public Shape[] getShapes();
    
    //redraw all shapes on the canvas
    public void refresh(java.awt.Graphics canvas);
}
