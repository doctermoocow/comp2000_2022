import java.awt.Color;

public class Wall extends Boundary {
    public Wall(int inX, int inY) {// constructor
        super(inX, inY);
        cellColour = Color.darkGray;
    }
}