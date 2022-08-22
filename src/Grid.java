import java.awt.Graphics;
import java.awt.Point;

public class Grid {
  Cell[][] cells = new Cell[20][20];
  String toolTip;

  public Grid() {
    for (int i = 0; i < cells.length; i++) {
      for (int j = 0; j < cells[i].length; j++) {
        // cells[i][j] = new Cell(10 + Cell.size * i, 10 + Cell.size * j); //initial
        // cell function.
        cells[i][j] = pickCellType(i, j);
      }
    }
  }

  public void paint(Graphics g, Point mousePos) {
    for (int i = 0; i < cells.length; i++) {
      for (int j = 0; j < cells[i].length; j++) {
        if (cells[i][j].paint(g, mousePos)) {
          setToolTipText(cells[i][j]);
        }
      }
    }
  }

  private Cell pickCellType(int i, int j) {
    Cell newCell;
    int x = 10 + Cell.size * i;
    int y = 10 + Cell.size * j;
    int random = (int) (Math.random() * 99 + 1); // random number between 0 and 100

    if (isBetween(random, 0, 9)) {
      newCell = new Wall(x, y);
    } else if (isBetween(random, 10, 19)) {
      newCell = new Fence(x, y);
    } else if (isBetween(random, 20, 29)) {
      newCell = new Stone(x, y);
    } else if (isBetween(random, 30, 49)) {
      newCell = new Sand(x, y);
    } else if (isBetween(random, 50, 69)) {
      newCell = new Water(x, y);
    } else if (isBetween(random, 60, 99)) {
      newCell = new Grass(x, y);
    } else {
      newCell = new Cell(x, y); // catch case shouldnt ever show though
    }
    return newCell;
  }

  private boolean isBetween(int x, int lower, int higher) { // checks if x is between the lower and higher bounds
                                                            // (inclusive)
    boolean result = false;
    if (x >= lower && x <= higher) {
      result = true;
    }
    return result;

  }

  public void setToolTipText(Cell cell) {
    toolTip = "<html>" + "Type: " + cell.cellType;
    if (cell.moveCost != 0) {
      toolTip += "<br>" + "Crossing Time: " + cell.moveCost / 5 + "</html>";

    } else {
      toolTip += "<br>Cannot cross" + "</html>";
    }
  }

  public String getToolTip() {
    return toolTip;
  }
}
