package demo;
import java.awt.*;

public class Square extends Rectangle {

    //Constructor
    public Square(int px, int py, Color c) {
        super(px, py, c);
    }

    //Method
    public void setBoundingBox(int heightBB, int widthBB) {
        //Un carré à tout ses cotés de même longueur.
        // On choisit de fixer la longueur des cotés à la longueur maximale entre length et width
        int M = Math.max(heightBB, widthBB);
        int m = Math.min(heightBB, widthBB);

        M=Math.abs(M);
        m=Math.abs(m);

       if (heightBB > 0 && widthBB > 0) {
            super.width = M;
            super.length = M;
       }



        else if (heightBB > 0 && widthBB < 0) {
            if (Math.abs(m) > Math.abs(M)) {
                super.width = m;
                super.length = -m;
            }
            else {
                super.width = -M;
                super.length = M;
            }
        }

        else if (heightBB < 0 && widthBB > 0) {
            if (Math.abs(m) > Math.abs(M)) {
                super.width = -m;
                super.length = m;
            }
            else {
                super.width = M;
                super.length = -M;
            }
        }
        else {
            super.width = m;
            super.length = m;
        }

    }
}
