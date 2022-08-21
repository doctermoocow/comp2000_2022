import java.awt.Color;

public class Grass extends Surface {

    public Grass(int inX, int inY) {// constructor
        super(inX, inY);
        moveCost = 20;
        cellColour = Color.green;
        cellType = "Grass";
    }
}