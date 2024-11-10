package Frontend;

import Interfaces.DrawingEngine;
import Interfaces.Shape;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JPanel;

public class ShapesManager extends JPanel implements DrawingEngine {

    protected HashMap<String, Shape> shapes;
    protected int countC = 0, countL = 0, countR = 0, countS = 0;

    public ShapesManager() {
        this.shapes = new HashMap<>();
    }

    @Override
    public void addShape(Shape shape) {
        shapes.put(shape.getName(), shape);
    }

    @Override
    public void removeShape(Shape shape) {
        shapes.remove(shape.getName());
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

}
