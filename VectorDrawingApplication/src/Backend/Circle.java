
package Backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;


public class Circle extends DefaultShape {

    public Circle(Point position,String shapeName,double radius) {
        super(position,shapeName);
        super.setColor(Color.BLACK);
        super.setFillColor(Color.WHITE);
        
        super.properties.put("radius", radius);
        super.properties.put("x2", (double)position.x);
        super.properties.put("y2",(double)position.y);
    }
    
    @Override
    public void setProperties(Map<String, Double> properties) {
    if(properties.containsKey("radius"))
        this.properties.put("radius",properties.get("radius"));
    if(properties.containsKey("x2"))
        this.properties.put("x2",properties.get("x2"));
    if(properties.containsKey("y2"))
        this.properties.put("y2",properties.get("y2"));
    
    }

    @Override
    public Map<String, Double> getProperties() {
        return properties;
    }

    @Override
    public void draw(Graphics canvas) {
        double radius=this.properties.get("radius");
        double x,y;
        x=this.properties.get("x2");
        y=this.properties.get("y2");
        
        canvas.setColor(this.getFillColor());
        canvas.fillOval((int)(x)-(int)radius,(int)(y)-(int)radius,2*(int)radius, 2*(int)radius);
        
        canvas.setColor(this.getColor());
        canvas.drawOval((int)(x)-(int)radius,(int)(y)-(int)radius,2*(int)radius, 2*(int)radius);
        
    }
    
}
