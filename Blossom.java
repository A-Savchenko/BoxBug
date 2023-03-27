import java.awt.Color;
import info.gridworld.actor.Flower;

public class Blossom extends Flower 
{
    private int lifetime; 
     private static final Color DEFAULT_COLOR = Color.GREEN;
    private static final double DARKENING_FACTOR = 0.05;
    /**
     * Constructs a box bug that traces a square of a given side length
     */
    public Blossom() 
    {
		setColor(DEFAULT_COLOR);
		lifetime = 10; 
	}
    public Blossom(int time)
    {
		setColor(DEFAULT_COLOR);
		lifetime = time; 
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
		lifetime--; 
		if(lifetime <= 0) this.removeSelfFromGrid(); 
		Color c = getColor();
        int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
        int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
        int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));

        setColor(new Color(red, green, blue));
                
    }
}
