package demo;
import java.awt.*;

public class Ellipse extends demo.Figure {

    //attributes
    protected int semiAxisX = 0;
    protected int semiAxisY = 0;

    //Constructor
    public Ellipse(int px, int py, Color c) {
        super(c, new Point(px, py));
    }

    //Methods
    public void setBoundingBox(int heightBB, int semiAxisXBB) {
        this.semiAxisX = semiAxisXBB;
        this.semiAxisY = heightBB;
    }

    public void draw(Graphics g) {
        int px = (int) this.getP().getX();
        int py = (int) this.getP().getY();
        Color c = this.getC();
        g.setColor(c);

        if (this.semiAxisX > 0 && this.semiAxisY > 0) {
            g.drawOval(px, py, this.semiAxisX, this.semiAxisY);
        }
        if (this.semiAxisX > 0 && this.semiAxisY < 0) {
            g.drawOval(px, py + this.semiAxisY, this.semiAxisX, -this.semiAxisY);
        }
        if (this.semiAxisX < 0 && this.semiAxisY > 0) {
            g.drawOval(px + this.semiAxisX, py, -this.semiAxisX, this.semiAxisY);
        }
        if (this.semiAxisX < 0 && this.semiAxisY < 0) {
            g.drawOval(px + this.semiAxisX, py + this.semiAxisY, -this.semiAxisX, -this.semiAxisY);
        }
    }

    @Override
    protected int getLength() {
        return 0;
    }
}

