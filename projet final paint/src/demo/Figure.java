package demo;
import java.awt.*;
import java.io.Serializable;

public abstract class Figure implements Serializable {

    //Attributes
    public Color c;
    protected Point point;

    //Methods
    public abstract void setBoundingBox (int length, int width);
    public abstract void draw (Graphics g);
    public Color getC() {
        return this.c;
    }
    public Point getP() {
        return this.point;
    }
    public Figure(Color c, Point point) {
        this.c = c;
        this.point = point;
    }

    //To String Method
    @Override
    public String toString() {
        return "Figure{}";
    }
    protected abstract int getLength();
}

