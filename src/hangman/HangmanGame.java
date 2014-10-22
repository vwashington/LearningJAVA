package hangman;

import java.util.*;

public class HangmanGame {

	// Create Arrays for words
			String[] sportsArray = {"Touchdown", "Goal", "Point Guard", "Baseball", "Basketball", "Football", "Penalty", "Referee", "Lacrosse", "Swimming"};
			String[] presidentsArray = {"Barrack Obama", "John Kennedy", "George Bush", "Abraham Lincoln", "Harry Truman", "Lyndon Johnson", "William Clinton"
					,"Richard Nixon", "Gerald Ford", "Theodore Roosevelt"};
			String[] carCompaniesArray = {"Ford", "Chevrolet", "Audi", "Honda", "Aston Martin", "Kia", "BMW", "Mercedes Benz", "Bentley", "Dodge", "Alfa Romeo"
					, "Bugatti", "Fiat", "Jeep" , "Jaguar", "Lamborghini", "Lexus", "Land Rover", "Nissan",  "Volvo", "Toyota", "Porsche", "Rolls Royce"
					, "Maserati", "Maybach", "Mazda", "Ferrari", "Infiniti"};
			
			
	
	HangmanGame(){
		
		
		}
		
	public int RandNumber(int maxIndex)
	{
		int index;
		
		rand.nextInt(maxIndex);
		return index;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int index =0;
		int randNum;
		
		ArrayList<String> sports = new ArrayList<String>();
		sports.addAll(sportsArray);
		// Random number generator
		randNum = RandNumber(sports);
		
	
		
		
		
	}

}
