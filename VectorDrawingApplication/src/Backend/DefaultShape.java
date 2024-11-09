
package Backend;

import java.awt.Color;
import java.awt.Point;


public abstract class DefaultShape implements Shape {
    private Point position;
    private Color color;
    private Color fillColor;

    public DefaultShape(Point position) {
        this.position = position;
        this.color = new Color(Color.BLACK.getRGB());
        this.fillColor = new Color(Color.WHITE.getRGB());
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
    
    
    
}
