package tests;

import dao.InputInstance;
import entities.Board;

public class InputInstanceTest {

	public static void main(String[] args) {
		
		Board board = InputInstance.getInstance("files/inputInstance.in");
		
		System.out.println(board);
		System.out.println(board.getBoardType());
		
	}
}
