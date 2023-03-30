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

//        for (Location loc : getLocationsInDirections(dirs))
//            if (getGrid().get(loc) == null)
//                locs.add(loc);

        return locs;
    }
}
