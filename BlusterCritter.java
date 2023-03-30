import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;

import java.util.ArrayList;
import info.gridworld.grid.Location;
import java.awt.Color;

public class BlusterCritter extends Critter
{
	private int c ;
	private static final double FACTOR = 0.05;

	public BlusterCritter(int n)
	{
		c = n;
	}

	public ArrayList<Actor> getActors()
	{
		Actor a;
		int actorCount = 0;
		ArrayList<Actor> act = new ArrayList<>();
		Location loc = getLocation();
		int r = loc.getRow();
		int c = loc.getCol();
		Grid<Actor> gr = getGrid();
		for (int i = r - 2; i <= r + 2; i++) {
			for (int x = c - 2; x <= c + 2; x++) {
				Location l = new Location(x, i);
				if (gr.isValid(l))
				{
					a = gr.get(l);
					if ((a instanceof Critter ))
					{
						actorCount++;
						act.add(a);
					}
				}
			}
		}
		actorCount--;
		Color color = getColor();
		int red, green, blue;
		red = color.getRed();
		green = color.getGreen();
		if (actorCount < c)
			 blue = (int) (color.getBlue() * (1 + FACTOR));
		else
			 blue = (int) (color.getBlue() * (1 - FACTOR));
		System.out.println(blue);
		if(blue > 255) blue = 255;
		setColor(new Color(red, green, blue));
		return act;
	}
}
