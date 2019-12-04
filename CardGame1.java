import java.util.Arrays;
import java.util.Random;

public class CardGame1 {

	public static void main(String[] args) {

		Random generator = new Random();

		int countH = 0, countD = 0, countC = 0, countS = 0, countDraw = 0, 
				myDraw = 0, yourDraw = 0, myLowRange = 0, myHighRange = 0,
				yourLowRange = 0, yourHighRange = 0, count1 = 0, count2 = 0;
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
				myLowRange = 1;
				myHighRange = 13;
			}
			else if (countD >= countH && countD >= countC && countD >= countS) {
				mySuit = "Diamonds";
				myLowRange = 14;
				myHighRange = 26;
			}
			else if (countC >= countH && countC >= countD && countC >= countS) {
				mySuit = "Clubs";
				myLowRange = 27;
				myHighRange = 39;
			}
			else if (countS >= countH && countS >= countC && countS >= countD) {
				mySuit = "Spades";
				myLowRange = 40;
				myHighRange = 52;
			}
		}
		countH = 0;
		countD = 0;
		countC = 0;
		countS = 0;
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
				yourLowRange = 1;
				yourHighRange = 13;
			}
			else if (countD >= countH && countD >= countC && countD >= countS) {
				yourSuit = "Diamonds";
				yourLowRange = 14;
				yourHighRange = 26;
			}
			else if (countC >= countH && countC >= countD && countC >= countS) {
				yourSuit = "Clubs";
				yourLowRange = 27;
				yourHighRange = 39;
			}
			else if (countS >= countH && countS >= countC && countS >= countD) {
				yourSuit = "Spades";
				yourLowRange = 40;
				yourHighRange = 52;
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
			if (myDraw >= myLowRange && myDraw <= myHighRange) {
				for (int i = 0; i < myHand.length; i++) {
					if (myHand[i] < myLowRange || myHand[i] > myHighRange) {
						myHand[i] = myDraw;
						break;
					}
				}
			}
			count1 = 0;
			for (int j=0; j<5;j++) {
				if (myHand[j] >= myLowRange && myHand[j] <= myHighRange) {
					count1++;
				}
			}
			System.out.println("\tMy new hand is " + Arrays.toString(myHand));
			if (count1 == 5 ) {
				winner = true;
				System.out.println("I am the winner.");
				break;
			}
			if (yourDraw >= yourLowRange && yourDraw <= yourHighRange) {
				for (int i = 0; i < yourHand.length; i++) {
					if (yourHand[i] < yourLowRange || yourHand[i] > yourHighRange) {
						yourHand[i] = yourDraw;
						break;
					}
				}
			}
			count2 = 0;
			for (int j=0; j<5; j++) {
				if (yourHand[j] >= yourLowRange && yourHand[j]<= yourHighRange){
					count2++;
				}
			}
			System.out.println("\tYour new hand is " + Arrays.toString(yourHand));
			if (count2 == 5) {
				winner = true;
				System.out.println("You are the winner.");
				break;
			}

		}
		System.out.println("The game is over.");
		

		
	}

}

