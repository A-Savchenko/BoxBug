import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import java.util.ArrayList; 
import info.gridworld.grid.Location;
import java.awt.Color;
public class ChameleonKid extends ChameleonCritter
{
	public ArrayList<Actor> getActors()
	{
		ArrayList <Actor> act = new ArrayList<Actor>(); 
		Location loc = getLocation(); 
		Location next = loc.getAdjacentLocation(getDirection());
		Actor a;
		Grid<Actor> gr = getGrid();
		if(gr.isValid(next)) 
		{
			a = gr.get(next);
			if(a instanceof Actor) act.add(a);
		}
		 next = loc.getAdjacentLocation(getDirection()+Location.HALF_CIRCLE);
		if(gr.isValid(next)) 
		{
			a = gr.get(next);
			if(a instanceof Actor) act.add(a);
		}
		
		return act; 
	}
}
