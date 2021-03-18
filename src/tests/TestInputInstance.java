package tests;

import dao.InputInstance;
import entities.Board;

public class TestInputInstance {

	public static void main(String[] args) {
		
		Board board = InputInstance.getInstance("files/inputInstance4x4.in");
		
		System.out.println(board);
		System.out.println(board.getBoardType());
		
	}
}
