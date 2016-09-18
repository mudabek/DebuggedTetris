package com.gamewerks.blocky.engine;

import java.util.Random;

public class Randomization {

	static PieceKind[] PieceArray = PieceKind.ALL;
	private static int PieceNumber;
	static PieceKind[] CurrentPieces = new PieceKind[7];
	
	public static PieceKind nextPiece() {
		if (PieceNumber == 0){
			int  numbers[] = Shuffle();
			for (int i = 0; i < 7; i++){
				int RandomNumber = numbers[i];
				CurrentPieces[i] = PieceArray[RandomNumber];
			}
		}
		PieceKind next = CurrentPieces[PieceNumber];
		PieceNumber++;
		if (PieceNumber >= 7) {
			PieceNumber = 0;
		}
		return next;
	}
	
	//CITE SOMETHING ON RANDOMIZING ARRAYS HERE
	public static int[] Shuffle() {
		int numbers[] = {0,1,2,3,4,5,6};
		for (int i = 0; i < 7; i++){
			Random rand = new Random();
			int n = rand.nextInt(6);
			int temp = numbers[i];
			numbers[i] = numbers[n];
			numbers[n] = temp;
		}
		return numbers;
	}

}
