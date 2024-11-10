
package Backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;


public class Rectangle extends DefaultShape {

    public Rectangle(Point position,String shapeName,double width,double height) {
        super(position,shapeName);
        super.setColor(Color.BLACK);
        super.setFillColor(Color.WHITE);
        super.properties.put("x", (double)position.x);
        super.properties.put("y",(double)position.y);
        super.properties.put("width",width);
        super.properties.put("height",height);
    }
    
    @Override
    public void setProperties(Map<String, Double> properties) {
    if(properties.containsKey("width"))
        this.properties.put("width",properties.get("width"));
    if(properties.containsKey("height"))
        this.properties.put("height",properties.get("height"));
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
        double width=this.properties.get("width");
        double height=this.properties.get("height");
        canvas.setColor(this.getColor());
        canvas.drawRect((this.getPosition().x)-(int)width,(this.getPosition().y)-(int)height,2*(int)width, 2*(int)height);
        
//        canvas.fillRect((this.getPosition().x)-(int)width,(this.getPosition().y)-(int)height,2*(int)width, 2*(int)height);
    }
    
}

