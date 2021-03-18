package entities;

import java.util.Arrays;

public class Board {

	private int[][] tiles;
	private int boardType;
	
	public Board(int[][] tiles, int aBoardType) {
		this.tiles = tiles;
		this.boardType = aBoardType;
	}
	
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + boardType;
		result = prime * result + Arrays.deepHashCode(tiles);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		if (!Arrays.deepEquals(tiles, other.tiles))
			return false;
		return true;
	}

	
	
}
