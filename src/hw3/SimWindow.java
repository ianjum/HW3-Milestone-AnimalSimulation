package hw3;

import edu.du.dudraw.Draw;

public class SimWindow {

	// Some static constants that everyone can use
	//   the represent the window size
	public final static int windowWidth = 1050;
	public final static int windowHeight = 700;

	private TerrainMap tm;
	private Draw duDwin;

	public SimWindow(TerrainMap tm) {

		// Setup the DuDraw window
		duDwin = new Draw("COMP2381 Animal Simulation"); // The OO version of DUDraw
		duDwin.setCanvasSize(SimWindow.windowWidth, SimWindow.windowHeight);
		duDwin.enableDoubleBuffering(); // Too slow otherwise -- need to use .show() later

		// Set the scale of the window
		// Right now it is set to match the pixels
		duDwin.setXscale(0, SimWindow.windowWidth);
		duDwin.setYscale(0, SimWindow.windowHeight);

		this.tm = tm;
	}

	public void update() {
		// TODO: Clear the entire window to white and draw the TerrainMap

		duDwin.show();  // used in double buffering
	}

	public void runSimulation() {
		// This is the main game loop
		update(); // Initial positing

		while(true) {

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			update();
		}	
	}
}