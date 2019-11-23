import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Sprite {

    public Sprite(int x, int y, int width, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.color = color;
    }

    public void translate (int dx, int dy) {
        x += dx;
        y += dy;
    }


    public void draw(Graphics2D g2) {
        //insert image code here

        Rectangle2D.Double temp = new Rectangle2D.Double(x, y, width, width);
        g2.setColor(color);
        g2.draw(temp);
        g2.fill(temp);
    }

    public Color getColor() {
        return color;
    }

    public boolean contains(Point2D p)
    {
        return x <= p.getX() && p.getX() <= x + width
                && y <= p.getY() && p.getY() <= y + width / 2;
    }

    private int x;
    private int y;
    private int width;
    private Color color;

}

