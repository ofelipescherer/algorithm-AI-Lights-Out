package entities;

import java.util.LinkedList;
import java.util.List;


public class State {

	public Board board;
	List<List<Integer>> tilesPressed;
	int boardType;
	
	public State(Board aBoard, int boardType) {
		this.board = aBoard;
		this.boardType = boardType;
		this.tilesPressed = new LinkedList<>();
	}
	
	public State(Board aBoard, int boardType, List<List<Integer>> tilesPressed) {
		this.board = aBoard;
		this.tilesPressed = tilesPressed;
		this.boardType = boardType;
	}
	
	public boolean isObjective() {
		
		if(this.equals(ObjectiveState.OBJECTIVESTATE3X3) && boardType == 3)
			return true;
		else if(this.equals(ObjectiveState.OBJECTIVESTATE4X4) && boardType == 4)
			return true;
		return false;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((board == null) ? 0 : board.hashCode());
		result = prime * result + boardType;
		result = prime * result + ((tilesPressed == null) ? 0 : tilesPressed.hashCode());
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
		State other = (State) obj;
		if (board == null) {
			if (other.board != null)
				return false;
		} else if (!board.equals(other.board))
			return false;
		if (boardType != other.boardType)
			return false;
		if (tilesPressed == null) {
			if (other.tilesPressed != null)
				return false;
		} else if (!tilesPressed.equals(other.tilesPressed))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String res = "\n";
		res += "State level: " + this.tilesPressed.size() + "\n";
		res += this.board + "\n";
		for(int i=0; i<this.tilesPressed.size(); i++) {
			for(int j=0; j<this.tilesPressed.get(i).size(); i++) {
				res += j + ", ";
			}
			res += "; ";
		}
		
		return res;
	}
	
	
}
