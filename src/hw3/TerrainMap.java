package hw3;

import java.util.Map;

import edu.du.dudraw.Draw;

// The TerrainMap represents a 2D grid of Tiles

public class TerrainMap implements Drawable {

	private Map<GridPoint, TerrainTile> theTiles;
	
	// public static constants set in the constructor.
	public static int gridWidth;
	public static int gridHeight;

	// Constructor to read from file
	public TerrainMap(String filename) {
		// TODO: Read the map specified by `filename` and add
		// TerrainTile objects (based on the terrain type specified by the map) to theTiles
		// Do it with a bufferedReader line by line
				// Then a String Tokenizer
				// Could probably use a Scanner as well
		
		// TODO: make sure you set gridWidth and gridHeight static data members when you 
		// read the map.
		
		// Now read the info (row by row)
				// Since 0,0 is in lower corner in DuDraw
				//   read the heights in upside down
	}
	
	public void draw(Draw duDwin) {
		// TODO: cause each of the TerrainTile objects to draw itself.
	}

}
