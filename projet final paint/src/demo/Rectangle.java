package demo;
import java.awt.*;

public class Rectangle extends demo.Figure {

    //Attributs
    public int width=0;
    public int length=0;

    //Constructor
    public Rectangle(int px, int py, Color c){
        super(c, new Point(px,py));
    }

    //Methods
    public int getWidth() {
        return this.width;
    }
    public int getLength() {
        return this.length;
    }
    public void setWidth(int width) {this.width = width;}
    public void setLength(int length) {this.length = length;}


    @Override
    public void setBoundingBox (int lengthBB, int widthBB){
        length = lengthBB;
        width = widthBB;
    }

    @Override
    public void draw(Graphics g) {

        //px py width length correspondent respectivement au point d'origine de la figure, à la longueur et la largeure
        int px = (int) this.getP().getX();
        int py = (int) this.getP().getY();
        int width = this.getWidth();
        int length = this.getLength();
        // "c" est la couleur que l'on veut pour le tracé de la figure
        Color c = this.getC();
        g.setColor(c);

        // Les 4 if permettent de tracer la figure dans tous les sens possibles
        //c'est à dire de la droite vers gauche de haut en bas et inversement
        if (width > 0 && length > 0) {
            g.drawRect(px, py, width, length);
        }
        if (width > 0 && length < 0) {
            g.drawRect(px, py + length, width, -length);
        }
        if (width < 0 && length > 0) {
            g.drawRect(px + width, py, -width, length);
        }
        if (width<0 && length<0){
            g.drawRect(px + width, py + length, -width, -length);
        }
    }
}

