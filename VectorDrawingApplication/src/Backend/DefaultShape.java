package Backend;

import Interfaces.Shape;
import java.awt.Color;
import java.awt.Point;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public abstract class DefaultShape implements Shape , Serializable {
    protected Map<String,Double> properties=new HashMap<>();
    private Point position;
    private Color color;
    private Color fillColor;
    private String shapeName;
    
    public DefaultShape()
    {
        
    }
    public DefaultShape(Point position, String shapeName) {
        //Default Shape implements all getters and setters for Shape interface
        this.position = position;
        this.shapeName = shapeName;
        this.color = Color.BLACK;
        this.fillColor = Color.WHITE;
    }

    @Override
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
    public Color getFillColor() {
        return fillColor;
    }

    @Override
    public String getName() {
        if (!this.shapeName.isEmpty()) {
            return this.shapeName;
        } else {
            return null;
        }

    }
}
