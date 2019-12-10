import java.util.Arrays;
import java.util.Random;

public class CardGame2 {

	public static void main(String[] args) {

		Random generator = new Random();

		int countH = 0, countD = 0, countC = 0, countS = 0, countDraw = 0, myDraw = 0, yourDraw = 0;
		String mySuit = null;
		String yourSuit = null;
		int[] myHand = new int[5];
		int[] yourHand = new int[5];
		int[] deck = new int[52];
		boolean winner = false;
		int mySuitHigh=0;
		int mySuitLow=0;
		int yourSuitHigh=0;
		int yourSuitLow=0;
		int yourGoodCount=0;
		int myGoodCount=0;
		int card =0;
		boolean goodCard=false;
		
		//take all cards out of play to begin game
		for (int c=0;c<52;c++)
		{deck[c]=0;}
		
		//assigns card values to MYHAND and determines suit
		for (int i = 0; i < myHand.length; i++) {


			//draw a card until a card if drawn that is not in play, insert into hand, mark as out of play
			while (goodCard==false) 
			{		
				card = generator.nextInt(52)+1;
				if (deck[card-1]==0) 
					{myHand[i] = card; deck[card-1]=1;break;}
			}	
			//end of while loop	

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

		//assigns card values to YOURHAND and determines suit
		for (int i = 0; i < yourHand.length; i++) {

			//draw a card until a card if drawn that is not in play, insert into hand, mark as out of play
			while (goodCard==false) 
			{		
				card = generator.nextInt(52)+1;
				if (deck[card-1]==0) 
					{yourHand[i] = card; deck[card-1]=1;break;}
			}	
			//end of while loop	

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

		//PRINT THE DECK ARRAY 1 MEANS CARD IS IN A HAND 0 MEANS IT IS AVAILABLE 
		System.out.println("The deck: " + Arrays.toString(deck));
		System.out.println();	

		if (mySuit.equals("Hearts")){mySuitLow=1;mySuitHigh = 13;}
		if (mySuit.equals("Diamonds")){mySuitLow=14;mySuitHigh = 26;}
		if (mySuit.equals("Clubs")){mySuitLow=27;mySuitHigh = 39;}
		if (mySuit.equals("Spades")){mySuitLow=40;mySuitHigh = 52;}
		if (yourSuit.equals("Hearts")){yourSuitLow=0;yourSuitHigh = 13;}
		if (yourSuit.equals("Diamonds")){yourSuitLow=14;yourSuitHigh = 26;}
		if (yourSuit.equals("Clubs")){yourSuitLow=27;yourSuitHigh = 39;}
		if (yourSuit.equals("Spades")){yourSuitLow=40;yourSuitHigh = 52;}

		//THE GAMELOOP repeats card draw until winner
		while (!winner) 
		{
			countDraw++;
			//draw a card for MYHAND until a card if drawn that is not in play
			while (goodCard==false) 
			{		
				card = generator.nextInt(52)+1;
				if (deck[card-1]==0) 
					{myDraw=card;break;}
			}	
			//end of while loop	
			System.out.println("My draw " + countDraw + ": " + myDraw);

			//draw a card for YOURHAND until a card if drawn that is not in play
			while (goodCard==false) 
			{		
				card = generator.nextInt(52)+1;
				if (deck[card-1]==0) 
					{yourDraw=card;break;}
			}	
			//end of while loop	
			System.out.println("Your draw " + countDraw + ": " + yourDraw);

			//Insert a card into MYHAND if it is in mysuit 
			if (myDraw>=mySuitLow && myDraw<=mySuitHigh) 
			{
				for (int i = 0; i < 5; i++) 
				{
					if (myHand[i] < mySuitLow || myHand[i]> mySuitHigh) 
					{
						deck[myHand[i]-1]=0;
						myHand[i] = myDraw;
						deck[myDraw-1]=1;
						break;}
				}
						
						
			}
			myGoodCount = 0;

			//check if MYHAND is a winner
			for (int j=0; j<5;j++) 
			{
				if (myHand[j]>=mySuitLow && myHand[j]<=mySuitHigh)
				{
					myGoodCount = myGoodCount+1;
				}
			}
			System.out.println("\tMy new hand is " + Arrays.toString(myHand));
			if (myGoodCount == 5 )
					{winner=true;System.out.println("I am the winner.");break;}
			
			//Insert a card into YOURHAND if it is in yoursuit 
			if (yourDraw>=yourSuitLow && yourDraw<=yourSuitHigh) 
			{
				for (int i = 0; i < 5; i++) 
				{
					if (yourHand[i] < yourSuitLow || yourHand[i]> yourSuitHigh) 
					{
						deck[yourHand[i]-1]=0;
						yourHand[i] = yourDraw;
						deck[yourDraw-1]=0;
					break;}
				}
						
						
			}
			yourGoodCount = 0;

			//check if YOURHAND a winner
			for (int j=0; j<5;j++) 
			{
				if (yourHand[j]>=yourSuitLow && yourHand[j]<=yourSuitHigh)
				{
					yourGoodCount = yourGoodCount+1;
				}
			}
			System.out.println("\tYour new hand is " + Arrays.toString(yourHand));
			if (yourGoodCount == 5 )
					{winner=true;System.out.println("You are the winner.");break;}

			//PRINT THE DECK ARRAY 1 MEANS CARD IS IN A HAND 0 MEANS IT IS AVAILABLE 
			System.out.println("The deck: " + Arrays.toString(deck));
			System.out.println();	
			
		}		
		System.out.println("The game is over.");

		//PRINT THE DECK ARRAY 1 MEANS CARD IS IN A HAND 0 MEANS IT IS AVAILABLE 
		System.out.println("The deck: " + Arrays.toString(deck));


	}

}