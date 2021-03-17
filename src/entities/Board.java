package entities;

public class Board {

	private int[][] tiles;
	private int boardType;
	
	public Board(int[][] tiles) {
		this.tiles = tiles;
	}
	

	public int getBoardType() {
		return boardType;
	}

	public void setBoardType(int boardType) {
		this.boardType = boardType;
	}

	public int[][] getTiles() {
		return tiles;
	}

	@Override
	public String toString() {
		String res = "";
		
		for(int i=0; i<this.getBoardType(); i++) {
			for(int j=0; j<this.getBoardType(); j++) 
				res += this.getTiles()[i][j] + " ";
			res += "\n";
		}
		
		return res;
	}

}
