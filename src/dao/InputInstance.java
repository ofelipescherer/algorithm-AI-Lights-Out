package dao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import entities.Board;


public class InputInstance {

	public static Board getInstance(String file) {
		
		Board board = null;
		
		InputStream is;
		InputStreamReader isr;
		BufferedReader br;
		
		try {
			is = new FileInputStream(file);
			isr = new InputStreamReader(is, StandardCharsets.UTF_8);
			br = new BufferedReader(isr);

			
			String line;
			
			line = br.readLine();
			int boardType = Integer.parseInt(line);
			
			int[][] tiles = new int[boardType][boardType];
			for(int i=0; i< boardType; i++) {
				
				line = br.readLine();
				
				String[] values = line.split(" ");
				
				for(int j=0; j < boardType; j++) {
					tiles[i][j] = Integer.parseInt(values[j]);
				}
			}
			board = new Board(tiles);
			board.setBoardType(boardType);
		} catch(IOException e) {
			e.printStackTrace();
		}
		return board;
	}
	
}


//is = new FileInputStream("files/alunos.csv");
//isr = new InputStreamReader(is, StandardCharsets.UTF_8);
//br = new BufferedReader(isr);
//
//String linha;
//while( (linha = br.readLine()) != null ) {
//	String[] palavras = linha.split("\\,");
//	String id = palavras[0];
//	String nome = palavras[1];
//	Aluno aluno = new Aluno(id, nome);
//	alunos.add(aluno);
//}
//br.close();
//isr.close();
//is.close();
//}catch(IOException e) {
//e.printStackTrace();
//}