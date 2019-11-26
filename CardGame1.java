import java.util.Arrays;
import java.util.Random;

public class CardGame1 {

	public static void main(String[] args) {

		Random generator = new Random();

		int countH = 0, countD = 0, countC = 0, countS = 0, countDraw = 0, myDraw = 0, yourDraw = 0;
		String mySuit = null;
		String yourSuit = null;
		int[] myHand = new int[5];
		int[] yourHand = new int[5];
		boolean winner = false;

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
		System.out.println("My hand has five cards: " + Arrays.toString(myHand));
		System.out.println("Your hand has five cards: " + Arrays.toString(yourHand));
		System.out.println("My suit is " + mySuit + ".");
		System.out.println("Your suit is " + yourSuit + ".");

		//repeats card draw until winner
		while (!winner) {
			countDraw++;
			myDraw = generator.nextInt(52) + 1;
			System.out.println("My draw " + countDraw + ": " + myDraw);
			yourDraw = generator.nextInt(52) + 1;
			System.out.println("Your draw " + countDraw + ": " + yourDraw);
			if (mySuit.equals("Hearts")) {
				for (int i = 0; i < myHand.length; i++) {
					if (myHand[i] > 13) {
						myHand[i] = myDraw;
						break;
					}
				}
				System.out.println("\tMy new hand is " + Arrays.toString(myHand));
				if ((myHand[0] >= 1 && myHand[0] <= 13) && (myHand[1] >= 1 && myHand[1] <= 13) && (myHand[2] >= 1 && myHand[2] <= 13) && (myHand[3] >= 1 && myHand[3] <= 13) && (myHand[4] >= 1 && myHand[4] <= 13)) {
					winner = true;
					System.out.println("I am the winner.");
					break;
				}
			}
			else if (mySuit.equals("Diamonds")) {
				for (int i = 0; i < myHand.length; i++) {
					if (myHand[i] < 14 && myHand[i] > 26) {
						myHand[i] = myDraw;
						break;
					}
				}
				System.out.println("\tMy new hand is " + Arrays.toString(myHand));
				if ((myHand[0] >= 14 && myHand[0] <= 26) && (myHand[1] >= 14 && myHand[1] <= 26) && (myHand[2] >= 14 && myHand[2] <= 26) && (myHand[3] >= 14 && myHand[3] <= 26) && (myHand[4] >= 14 && myHand[4] <= 26)) {
					winner = true;
					System.out.println("I am the winner.");
					break;
				}
			}
			else if (mySuit.equals("Clubs")) {
				for (int i = 0; i < myHand.length; i++) {
					if (myHand[i] < 27 && myHand[i] > 39) {
						myHand[i] = myDraw;
						break;
					}
				}
				System.out.println("\tMy new hand is " + Arrays.toString(myHand));
				if ((myHand[0] >= 27 && myHand[0] <= 39) && (myHand[1] >= 27 && myHand[1] <= 39) && (myHand[2] >= 27 && myHand[2] <= 39) && (myHand[3] >= 27 && myHand[3] <= 39) && (myHand[4] >= 27 && myHand[4] <= 39)) {
					winner = true;
					System.out.println("I am the winner.");
					break;
				}
			}
			else if (mySuit.equals("Spades")) {
				for (int i = 0; i < myHand.length; i++) {
					if (myHand[i] < 40) {
						myHand[i] = myDraw;
						break;
					}
				}
				System.out.println("\tMy new hand is " + Arrays.toString(myHand));
				if ((myHand[0] >= 40 && myHand[0] <= 52) && (myHand[1] >= 40 && myHand[1] <= 52) && (myHand[2] >= 40 && myHand[2] <= 52) && (myHand[3] >= 40 && myHand[3] <= 52) && (myHand[4] >= 40 && myHand[4] <= 52)) {
					winner = true;
					System.out.println("I am the winner.");
					break;
				}
			}
	
			if (yourSuit.equals("Hearts")) {
				for (int i = 0; i < yourHand.length; i++) {
					if (yourHand[i] > 13) {
						yourHand[i] = yourDraw;
						break;
					}
				}
				System.out.println("\tYour new hand is " + Arrays.toString(yourHand));
				if ((yourHand[0] >= 1 && yourHand[0] <= 13) && (yourHand[1] >= 1 && yourHand[1] <= 13) && (yourHand[2] >= 1 && yourHand[2] <= 13) && (yourHand[3] >= 1 && yourHand[3] <= 13) && (yourHand[4] >= 1 && yourHand[4] <= 13)) {
					winner = true;
					System.out.println("You are the winner.");
					break;
				}
			}
			else if (yourSuit.equals("Diamonds")) {
				for (int i = 0; i < yourHand.length; i++) {
					if (yourHand[i] < 14 && yourHand[i] > 26) {
						yourHand[i] = yourDraw;
						break;
					}
				}
				System.out.println("\tYour new hand is " + Arrays.toString(yourHand));
				if ((yourHand[0] >= 14 && yourHand[0] <= 26) && (yourHand[1] >= 14 && yourHand[1] <= 26) && (yourHand[2] >= 14 && yourHand[2] <= 26) && (yourHand[3] >= 14 && yourHand[3] <= 26) && (yourHand[4] >= 14 && yourHand[4] <= 26)) {
					winner = true;
					System.out.println("You are the winner.");
					break;
				}
			}
			else if (yourSuit.equals("Clubs")) {
				for (int i = 0; i < yourHand.length; i++) {
					if (yourHand[i] < 27 && yourHand[i] > 39) {
						yourHand[i] = yourDraw;
						break;
					}
				}
				System.out.println("\tYour new hand is " + Arrays.toString(yourHand));
				if ((yourHand[0] >=27 && yourHand[0] <= 39) && (yourHand[1] >= 27 && yourHand[1] <= 39) && (yourHand[2] >= 27 && yourHand[2] <= 39) && (yourHand[3] >= 27 && yourHand[3] <= 39) && (yourHand[4] >= 27 && yourHand[4] <= 39)) {
					winner = true;
					System.out.println("You are the winner.");
					break;
				}
			}
			else if (yourSuit.equals("Spades")) {
				for (int i = 0; i < yourHand.length; i++) {
					if (yourHand[i] < 40) {
						yourHand[i] = yourDraw;
						break;
					}
				}
				System.out.println("\tYour new hand is " + Arrays.toString(yourHand));
				if ((yourHand[0] >= 40 && yourHand[0] <= 52) && (yourHand[1] >= 40 && yourHand[1] <= 52) && (yourHand[2] >= 40 && yourHand[2] <= 52) && (yourHand[3] >= 40 && yourHand[3] <= 52) && (yourHand[4] >= 40 && yourHand[4] <= 52)) {
					winner = true;
					System.out.println("You are the winner.");
					break;
				}
			}


		}


		System.out.println("The game is over.");


	}

}