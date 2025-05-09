
package Interfaces;

import java.awt.Color;
import java.awt.Point;
import java.util.Map;

public interface Shape {
    public void setPosition(Point position);
    public Point getPosition();
    
    //Update Shape specific properties
    public void setProperties(Map<String,Double> properties);
    public Map<String,Double> getProperties();
    
    //Colorize
    public void setColor(Color color);
    public Color getColor();
    public void setFillColor(Color color);
    public Color getFillColor();
    //Redraw the shape on the canvas
    public void draw(java.awt.Graphics canvas0);
    
    public String getName();
    public void setShapeName(String shapeName);
}
