
public class Main {
	
	public static void main (String[] args) {
		boolean gameOver = true; 
		boolean secondScore = true;
		int score = 800;
		int secondScore1 = 10000;
		int levelCompleted = 5;
		int secondScoreLevel = 8;
		int bonus = 100;
		int secondBonus = 200;
		
//		if (score < 5000 && score > 1000) {
//			System.out.println("Your score was less than 5000 but greater than 1000");
//		} else if (score <1000) {
//			System.out.println("Your score was less than 1000");
//		} else {
//			System.out.println("Got here");
//		}
//		
		// code blocks are optional. however, if you have one line, you should use code blocks. 
		
		if (gameOver) {
			int finalScore = score + ( levelCompleted * bonus );
			System.out.println("Your final score was " + finalScore);
		}
		
		if (secondScore) {
			int finalScoreSecond = secondScore1 + ( secondScoreLevel * secondBonus );
			System.out.println("Second place score was " + finalScoreSecond);
		}
		
		// print out a second score on the screen with the following
		// score set to 10000
		// levelCompleted set to 8
		// bonus set to 200
		// but make sure the firsdt printout above sill displays as well. 
		
		
	}

}
