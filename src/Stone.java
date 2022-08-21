import java.awt.Color;

public class Stone extends Surface {

    public Stone(int inX, int inY) {// constructor
        super(inX, inY);
        moveCost = 10;
        cellColour = Color.lightGray;
        cellType = "Stone";
    }
}