package hw3;

/*
 * Class to represent an x and y grid location.
 * 
 * TODO: Should have standard methods: equals, toString, hashCode, compareTo
 */
public class GridPoint implements Comparable<GridPoint>{

	private int x;
	private int y;
	
	public GridPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(GridPoint o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
