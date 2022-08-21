import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.*;

public class Cell {
  // fields
  int x;
  int y;
  Color cellColour;
  static int size = 35;

  // constructors
  public Cell(int inX, int inY) {
    x = inX;
    y = inY;
  }

  // methods
  public void paint(Graphics g, Point mousePos) {
    JToolTip.setTipText("asdasd");
    g.setColor(cellColour);

    g.fillRect(x, y, size, size);
    g.setColor(Color.BLACK);
    g.drawRect(x, y, size, size);
  }

  public boolean contains(Point p) {
    if (p != null) {
      return x < p.x && x + size > p.x && y < p.y && y + size > p.y;
    } else {
      return false;
    }
  }
}
