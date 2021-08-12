/**
 * @author Rowena
 * The class Position creates objects that represent a square's position (row and column) in the board game.
 **/

public class Position {
	
	private int positionRow;
	private int positionColumn;
	
	/**
	 * Constructor sets the private variables positionRow and positionColumn to the parameters row and col
	 **/
	public Position(int row, int col) {
		positionRow = row;
		positionColumn = col;
	}

	/**
	 * Returns the square's row
	 **/
	public int getRow() {
		return positionRow;
	}
	
	/**
	 * Returns the square's column
	 **/ 
	public int getCol() {
		return positionColumn;
	}
	
	/**
	 * Sets the square's row
	 **/
	public void setRow(int newRow) {
		positionRow = newRow;
	}
	
	/**
	 * Returns the square's column
	 **/ 
	public void setCol(int newCol) {
		positionColumn = newCol;
	}

	/**
	 * Returns true if Position and otherPosition have the same row and column values 
	 * Otherwise returns false
	 **/
	public boolean equals(Position otherPosition) {
		if (this.positionColumn == otherPosition.positionColumn && this.positionRow == otherPosition.positionRow) {
			  return true;
		}
		else {
			  return false;
		}
	}
}
