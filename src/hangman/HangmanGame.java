package hangman;

import java.util.*;

public class HangmanGame {

	// Array List for Words
	ArrayList<String> sports = new ArrayList<String>();
	ArrayList<String> presidents = new ArrayList<String>();
	ArrayList<String> cars = new ArrayList<String>();
	
	//Random Number Object
	Random rand = new Random();
			
			
	
	HangmanGame(){
		
		// Create Arrays for words
		String[] sportsArray = {"Touchdown", "Goal", "Point Guard", "Baseball", "Basketball", "Football", "Penalty", "Referee", "Lacrosse", "Swimming"};
		String[] presidentsArray = {"Barrack Obama", "John Kennedy", "George Bush", "Abraham Lincoln", "Harry Truman", "Lyndon Johnson", "William Clinton"
					,"Richard Nixon", "Gerald Ford", "Theodore Roosevelt"};
		String[] carCompaniesArray = {"Ford", "Chevrolet", "Audi", "Honda", "Aston Martin", "Kia", "BMW", "Mercedes Benz", "Bentley", "Dodge", "Alfa Romeo"
					, "Bugatti", "Fiat", "Jeep" , "Jaguar", "Lamborghini", "Lexus", "Land Rover", "Nissan",  "Volvo", "Toyota", "Porsche", "Rolls Royce"
					, "Maserati", "Maybach", "Mazda", "Ferrari", "Infiniti"};
		
	}
		
	public static int RandNumber(int minIndex, int maxIndex)
	{
		int index =0;
		
		index = rand.nextInt((maxIndex - minIndex) + 1) + minIndex;
		
		return index;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner intake = new Scanner();
		int index;
		int randNum;
		boolean finished = true;

		do
		{
			System.out.println("Welcome to the Hangman Game");
			System.out.println("1. Select Topic");
			System.out.println("2. Random Topic");
			System.out.println("3. Quit Game\n");
			index = intake.nextInt();
			switch(index){
			
			case 1: 
				
			}
			
		}while(finsihed);
		// Random number generator
		randNum = RandNumber();
		
	
		
		
		
	}

}
