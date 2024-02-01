package hw3;

import edu.du.dudraw.Draw;

// This is an abstract class
public abstract class TerrainTile implements Drawable {
	
	// Every tile has a location
	private GridPoint location;
	
	protected TerrainTile (GridPoint location) {
		this.location = location;
	}

	// Draws the tile on the given Window
	public void draw(Draw duDwin) {
//		int width = SimWindow.windowWidth/TerrainMap.gridWidth;
//		int height = SimWindow.windowHeight/TerrainMap.gridHeight;
//		
//		double x = (location.getX()*width) + (width/2);
//		double y = (location.getY()*height) + (height/2); 
		
		// TODO: Get the derived class to set whatever color it wants by calling 
		// the abstract method.
		
		// TODO: draw the tile in a standard way. 
		// use duDwin.filledRectangle(x, y, halfWidth, halfHeight)
		
	}
	
	// Part of the draw template for concrete tiles to set the color
	public abstract void setColor(Draw duDwin);
	
}
