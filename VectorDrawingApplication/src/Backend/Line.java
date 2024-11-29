
package Backend;

import java.awt.Graphics;
import java.awt.Point;
import java.io.Serializable;
import java.util.Map;

public class Line extends DefaultShape {
    private Point p2;

    public Line(Point p1,String shapeName,Point p2) {
        super(p1,shapeName);
        this.p2=p2;
        super.properties.put("x1",(double)p1.x);
        this.properties.put("y1",(double)p1.y);
        this.properties.put("x2",(double)p2.x);
        this.properties.put("y2",(double)p2.y);
        
        
    }
    
    @Override
    public void setProperties(Map<String, Double> properties) {
    if(properties.containsKey("x1"))
        this.properties.put("x1",properties.get("x1"));
    if(properties.containsKey("y1"))
        this.properties.put("y1",properties.get("y1"));
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
        double x1,x2,y1,y2;
        x1=this.properties.get("x1");
        x2=this.properties.get("x2");
        y1=this.properties.get("y1");
        y2=this.properties.get("y2");
        canvas.setColor(this.getColor());
        canvas.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
        
    }
}
