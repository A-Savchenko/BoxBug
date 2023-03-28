import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import java.util.ArrayList; 
import info.gridworld.grid.Location;
import java.awt.Color;
public class RockHound extends Critter
{	
	public void processActors(ArrayList<Actor> actors)
    {
        int n = actors.size();
        if (n == 0)
            return;
        int r = (int) (Math.random() * n);

        Actor other = actors.get(r);
        if(other instanceof Rock) other.removeSelfFromGrid();
    }
}
