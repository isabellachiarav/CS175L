import java.util.Random;

public class CardGame1 {

	public static void main(String[] args) {
		
		Random generator = new Random();
		
		int countH = 0, countD = 0, countC = 0, countS = 0;
		String mySuit = null;
		String yourSuit = null;
		int[] myHand = new int[5];
		int[] yourHand = new int[5];
	
		//assigns card values to both hands and determines suit
		for (int i = 0; i < myHand.length; i++) {
	         myHand[i] = generator.nextInt(52) + 1;
	         if (myHand[i] >= 1 && myHand[i] <= 13) {
	        	 countH++;
	         }
	         else if (myHand[i] >= 14 && myHand[i] <= 26) {
	        	 countD++;
	         }
	         else if (myHand[i] >= 27 && myHand[i] <= 39) {
	        	 countC++;
	         }
	         else if (myHand[i] >= 40 && myHand[i] <= 52) {
	        	 countS++;
	         }
	         if (countH >= countD && countH >= countC && countH >= countS) {
	        	 mySuit = "Hearts";
	         }
	         else if (countD >= countH && countD >= countC && countD >= countS) {
	        	 mySuit = "Diamonds";
	         }
	         else if (countC >= countH && countC >= countD && countC >= countS) {
	        	 mySuit = "Clubs";
	         }
	         else if (countS >= countH && countS >= countC && countS >= countD) {
	        	 mySuit = "Spades";
	         }
		}
		for (int i = 0; i < yourHand.length; i++) {
	         yourHand[i] = generator.nextInt(52) + 1;
	         if (yourHand[i] >= 1 && yourHand[i] <= 13) {
	        	 countH++;
	         }
	         else if (yourHand[i] >= 14 && yourHand[i] <= 26) {
	        	 countD++;
	         }
	         else if (yourHand[i] >= 27 && yourHand[i] <= 39) {
	        	 countC++;
	         }
	         else if (yourHand[i] >= 40 && yourHand[i] <= 52) {
	        	 countS++;
	         }
	         if (countH >= countD && countH >= countC && countH >= countS) {
	        	 yourSuit = "Hearts";
	         }
	         else if (countD >= countH && countD >= countC && countD >= countS) {
	        	 yourSuit = "Diamonds";
	         }
	         else if (countC >= countH && countC >= countD && countC >= countS) {
	        	 yourSuit = "Clubs";
	         }
	         else if (countS >= countH && countS >= countC && countS >= countD) {
	        	 yourSuit = "Spades";
	         }
		}
		
	
		
		

	}

}
