/**
 * By Rowena Shi || 251073629
 * The class BoardGame represents the board game.
 **/

public class BoardGame {
	
	private int board_length;
	private int board_width;
	private Snake theSnake;
	private String[][] matrix;
	
    /**
     * Constructor reads in lines from boardFile to place objects
     **/
	public BoardGame(String boardFile) {
		
		MyFileReader in;
		int x;
		int y;
		
		in = new MyFileReader(boardFile);
	    
		in.readInt();
	    in.readInt();
	    
	    board_length = in.readInt();
	    board_width = in.readInt();
		
	    x = in.readInt();
	    y = in.readInt();
	    
	    theSnake = new Snake(x,y);
	    
	    matrix = new String[board_width][board_length];
	    
	    for (int i = 0; i < board_width; ++i)
				for (int j = 0; j < board_length; ++j) {
	    			matrix[i][j] = "empty";
				}
						
	    while (in.endOfFile() == false) {
		   int a = in.readInt();
		   int b = in.readInt();
		   String line = in.readString();
		   matrix[a][b] = line;
		   
		}    
	    
	}
		
    /**
     * Returns the string stored in matrix[row][col]
     **/
	public String getObject(int row, int col) {
		return matrix[row][col];
	}
	
    /**
     * Stores newObject in matrix[row][col]
     **/
	public void setObject(int row, int col, String newObject) {
		matrix[row][col] = newObject;
	}
	
    /**
     * Returns theSnake
     **/
	public Snake getSnake() {
		return theSnake;
	}
	
    /**
     * Stores the value of newSnake in instance variable theSnake
     **/
	public void setSnake(Snake newSnake) {
		theSnake = newSnake;
	}
	
    /**
     * Returns board_length 
     **/
	public int getLength() {
		return board_length;
	}
	
    /**
     * Returns board_width
     **/
	public int getWidth() {
		return board_width;
	}
	
    /**
     * Returns matrix[row][col] 
     **/
	public String getType(int row, int col) {
		return matrix[row][col];
	}
}