import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;

import java.util.ArrayList;
import info.gridworld.grid.Location;
import java.awt.Color;

public class QuickCrab extends CrabCritter
{
    public ArrayList<Location> getMoveLocations()
    {
        ArrayList<Location> locs = new ArrayList<Location>();
        int[] dirs =
                { Location.LEFT, Location.RIGHT };
        Location current = getLocation(); 
        for (Location loc : getLocationsInDirections(dirs))
        {
            if(loc.equals(current)) continue; 
            if (getGrid().get(loc) == null)
                locs.add(loc);
		}
        return locs;
	}
	public ArrayList<Location> getLocationsInDirections(int[] directions)
    {
        ArrayList<Location> locs = new ArrayList<Location>();
        Grid gr = getGrid();
        Location loc = getLocation();
		int[] dirs =
                { Location.LEFT, Location.RIGHT };
        for (int d : dirs)
        {	
			Location neighborLoc = loc.getAdjacentLocation(getDirection()+d).getAdjacentLocation(getDirection()+d);
           
            if (gr.isValid(neighborLoc))
                locs.add(neighborLoc);
        }
        return locs;
    }    
}
