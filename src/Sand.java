import java.awt.Color;

public class Sand extends Surface {

    public Sand(int inX, int inY) {// constructor
        super(inX, inY);
        moveCost = 50;
        cellColour = Color.yellow;
        cellType = "Sand";
    }
}