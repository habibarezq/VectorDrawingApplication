
package Backend;

import java.awt.Color;
import java.awt.Point;


public abstract class DefaultShape implements Shape {
    private Point position;
    private Color color;
    private Color fillColor;
    private String shapeName;

    public DefaultShape(Point position,String shapeName) {
        this.position = position;
        this.shapeName=shapeName;
        this.color = Color.BLACK;
        this.fillColor = Color.WHITE;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
    @Override
    public Point getPosition() {
        return position;
    }
    @Override
    public void setPosition(Point position) {
        this.position = position;
    }
    @Override
    public Color getColor() {
        return color;
    }
    @Override
    public void setColor(Color color) {
        this.color = color;
    }
    
    @Override
    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
        
    }
    
    
    @Override
    public String getName()
    {
        if(!this.shapeName.isEmpty())
            return this.shapeName;
        else
            return null;
        
    }
}
