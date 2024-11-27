
package Backend;

import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;


public class Square extends DefaultShape {

    public Square(Point position,String shapeName,double length) {
        super(position,shapeName);
        super.properties.put("x2", (double)position.x);
        super.properties.put("y2",(double)position.y);
        super.properties.put("length", length);
    }
    
    @Override
    public void setProperties(Map<String, Double> properties) {
    if(properties.containsKey("length"))
        this.properties.put("length",properties.get("length"));
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
        double length=this.properties.get("length");
        double x,y;
        x=this.properties.get("x2");
        y=this.properties.get("y2");
        
        canvas.setColor(this.getColor());
        canvas.drawRect((int)x-(int)length,(int)y-(int)length,2*(int)length, 2*(int)length);
        
    }
    
}
