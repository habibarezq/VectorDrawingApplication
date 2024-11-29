package Frontend;

import Interfaces.DrawingEngine;
import Interfaces.Shape;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;

public class ShapesManager extends JPanel implements DrawingEngine {

    protected HashMap<String, Shape> shapes;
    private int countC = 0, countL = 0, countR = 0, countS = 0;

    public ShapesManager() {
        this.shapes = new HashMap<>();
    }

    public int getCountC() {
        return countC;
    }

    public void setCountC(int countC) {
        this.countC = countC;
    }

    public int getCountL() {
        return countL;
    }

    public void setCountL(int countL) {
        this.countL = countL;
    }

    public int getCountR() {
        return countR;
    }

    public void setCountR(int countR) {
        this.countR = countR;
    }

    public int getCountS() {
        return countS;
    }

    public void setCountS(int countS) {
        this.countS = countS;
    }
    public void resetCount()
    {
        this.countC=0;
        this.countL=0;
        this.countR=0;
        this.countS=0;
    }
    @Override
    public void addShape(Shape shape) {
        shapes.put(shape.getName(), shape);
    }

    @Override
    public void removeShape(Shape shape) {
        shapes.remove(shape.getName());
//        if(shape instanceof Line)
//            this.countL--;
//        else if(shape instanceof Square)
//            this.countS--;
//        else if(shape instanceof Rectangle)
//            this.countR--;
//        else if(shape instanceof Circle)
//            this.countC--;
    }

    @Override
    public Shape[] getShapes() {
        ArrayList<Shape> shapesList = new ArrayList<>(shapes.values());
        return shapesList.toArray(Shape[]::new);
    }

    @Override
    public void refresh(Graphics canvas) {
        canvas.setColor(Color.WHITE);
        canvas.fillRect(0, 0, 510, 350);
        for (Shape s : this.getShapes()) {
            s.draw(canvas);
        }
    }
    @Override
    public void moveShape(Shape shape,Map<String, Double> properties)
    {
        
        Shape toMove =shapes.get(shape.getName());
        toMove.setProperties(properties);
        
    }
    @Override
    public void resizeShape(Shape shape,Map<String, Double> properties)
    {
        
        Shape toResize =shapes.get(shape.getName());
        toResize.setProperties(properties);
        
    }
    

}
