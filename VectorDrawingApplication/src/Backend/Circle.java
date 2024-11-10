
package Backend;

import Interfaces.Shape;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;


public class Circle extends DefaultShape implements Shape{

    private Map<String,Double> properties=new HashMap<>();

    public Circle(Point position,String shapeName,double radius) {
        super(position,shapeName);
        this.properties.put("radius", radius);
        
    }
    
    @Override
    public void setProperties(Map<String, Double> properties) {
    if(properties.containsKey("radius"))
        this.properties.put("radius",properties.get("radius"));
    }

    @Override
    public Map<String, Double> getProperties() {
        return properties;
    }

    @Override
    public void draw(Graphics canvas) {
        double radius=this.properties.get("radius");
        canvas.setColor(this.getColor());
        canvas.drawOval((this.getPosition().x)-(int)radius,(this.getPosition().y)-(int)radius,2*(int)radius, 2*(int)radius);
        
    }
    
}
