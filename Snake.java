/**
 * @author Rowena
 * The class Snake stores information about the snake.
 * It contains methods to get and manipulate the snakes's length and position.
 **/


public class Snake {

	private int snakeLength;
	private Position[] snakeBody;
	
    /**
     * Constructor sets the initial length and position 
     **/
	public Snake(int row, int col) {
 		
		snakeLength = 1;
		snakeBody = new Position[5];
		snakeBody[0]= new Position(row,col);	 
	}
	
    /**
     * Returns the snake's length 
     **/
	public int getLength() {
		return snakeLength;
	}
	
    /**
     * Returns the Position object stored in snakeBody[index]. It returns null if index < 0 or index >= snakeLength 
     **/
	public Position getPosition(int index) {
		
		if (index < 0 || index >= snakeLength) {
			return null;
		}else{
			return snakeBody[index];
		}
	}
	
    /**
     * Decreases the value of snakeLength by 1 
     **/
	public void shrink() {
		snakeLength = getLength() - 1;
		
	}

	/**
	 ** Returns true if pos is in array snakeBody and returns false otherwise 
	 **/
	public boolean snakePosition(Position pos) {
		
		for (int i = 0; i < snakeLength; ++i) 
			if (snakeBody[i].equals(pos)) return true;
		return false;
	}

	/**
     * Returns the new position of the head of the snake when the snake moves in the direction specified by the parameter 
     **/
	public Position newHeadPosition(String direction) {
			int row = snakeBody[0].getRow();
			int col = snakeBody[0].getCol();
		if (direction == "right") {
			col++;
			
		}else if (direction == "left") {
			col--;
			
		}else if (direction == "up") {
			row--;
			
		}else if (direction == "down") {
			row++;
		}
			Position newPos = new Position(row,col);
		return newPos;
	}

    /**
     * Moves the snake in the specified direction 
     **/
	public void moveSnake(String direction) {
		
		Position newPos = newHeadPosition(direction);
		if (snakeLength >= 2)
			for (int i = snakeLength-2; i >= 0; --i)
				snakeBody[i+1] = snakeBody[i];
		snakeBody[0] = newPos;
	}

    /**
     * Increases the length of the snake by 1 and moves the snake’s head in the direction specified 
     **/
	public void grow(String direction) {
		
		if (snakeLength == snakeBody.length) {
			
			increaseArraySize();
		}
		Position newHead = newHeadPosition(direction);
	    for (int i = snakeLength-1; i >= 0; --i)
		snakeBody[i+1] = snakeBody[i];
	    snakeBody[0] = newHead;
		
		snakeLength++;
		
	}
	
    /**
     * Doubles the size of array snakeBody 
     **/
	private void increaseArraySize() {
		
		Position[] newSnake = new Position[snakeBody.length * 2];
		
		for (int x = 0; x < snakeBody.length; x++) {
			newSnake[x] = snakeBody[x];
		}
		snakeBody = newSnake;
		
	}
		
}
