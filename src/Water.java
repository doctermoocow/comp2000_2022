import java.awt.Color;

public class Water extends Surface {

    public Water(int inX, int inY) {// constructor
        super(inX, inY);
        moveCost = 100;
        cellColour = Color.blue;
    }
}