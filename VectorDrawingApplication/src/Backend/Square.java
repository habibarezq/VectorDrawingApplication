
package Backend;

import Interfaces.Shape;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;


public class Square extends DefaultShape implements Shape{
    //private double radius;
    private Map<String,Double> properties=new HashMap<>();

    public Square(Point position,String shapeName,double length) {
        super(position,shapeName);
        this.properties.put("x", (double)position.x);
        this.properties.put("y",(double)position.y);
        this.properties.put("length", length);
    }
    
    @Override
    public void setProperties(Map<String, Double> properties) {
    if(properties.containsKey("length"))
        this.properties.put("length",properties.get("length"));
    if(properties.containsKey("x"))
        this.properties.put("x",properties.get("x"));
    if(properties.containsKey("y"))
        this.properties.put("y",properties.get("y"));
    
    }
    

    @Override
    public Map<String, Double> getProperties() {
        return properties;
    }

    @Override
    public void draw(Graphics canvas) {
        double length=this.properties.get("length");
        canvas.setColor(this.getColor());
        canvas.drawRect((this.getPosition().x)-(int)length,(this.getPosition().y)-(int)length,2*(int)length, 2*(int)length);
        
    }
    
}
