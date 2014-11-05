package hangman;

import java.util.*;


public class HangmanGame {
	
			
			
	
	HangmanGame(){
		
		
		
		
	
		
		
	}
	
		
	public static int RandNumber(int minIndex, int maxIndex)
	{
		Random rand = new Random();
		int index =0;
		
		index = rand.nextInt((maxIndex - minIndex) + 1) + minIndex;
		
		return index;
	}
	
	public static void mainMenu()
	{
		System.out.println("************************************************");
		System.out.println("Welcome to the Hangman Game");
		System.out.println("1. Select Topic");
		System.out.println("2. Random Topic");
		System.out.println("3. Quit Game\n");
		
	}
	
	public static void topicMenu1()
	{
		System.out.println("************************************************");
		System.out.println("Choose your Topic");
		System.out.println("1. Sports");
		System.out.println("2. US Presidents");
		System.out.println("3. Car Companies");
		System.out.println("4. Quit Game\n");
		
	}
	
	public static void startGame(List<String> wordList, String[] topicList)
	{
		Scanner inputLetter = new Scanner(System.in);
		char letter,upletter;
		int wordIndex 0;
		int correct = 0;
		int wrong = 0;
		
		//Select Random Wrod from List
		wordIndex = RandNumber(0,(topicList.length-1));
		topicList[wordIndex] = topicList[wordIndex].toUpperCase();
		char[] word = topicList[wordIndex].toCharArray();
		
		while(wrong < 8)
		{
			System.out.println("\n\n\n\n\n\n\n\n");
			System.out.println("Enter a Letter");
			letter = (char)inputLetter.nextInt();
			upletter = Character.toUpperCase(letter);
			for(int x =0; x < word.length;x++)
					if(letter == word[x])
						correct++;
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sportsArray = {"Touchdown", "Goal", "Point Guard", "Baseball", "Basketball", "Football", "Penalty", "Referee", "Lacrosse", "Swimming"};
		String[] presidentsArray = {"Barrack Obama", "John Kennedy", "George Bush", "Abraham Lincoln", "Harry Truman", "Lyndon Johnson", "William Clinton"
					,"Richard Nixon", "Gerald Ford", "Theodore Roosevelt"};
		String[] carCompaniesArray = {"Ford", "Chevrolet", "Audi", "Honda", "Aston Martin", "Kia", "BMW", "Mercedes Benz", "Bentley", "Dodge", "Alfa Romeo"
					, "Bugatti", "Fiat", "Jeep" , "Jaguar", "Lamborghini", "Lexus", "Land Rover", "Nissan",  "Volvo", "Toyota", "Porsche", "Rolls Royce"
					, "Maserati", "Maybach", "Mazda", "Ferrari", "Infiniti"};
		String[] alphabet = { "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		Scanner intake = new Scanner(System.in);
		int index;
		int randNum;
		int selection;
		boolean finished = true;
		List<String> sports = Arrays.asList(sportsArray);
		List<String> presidents = Arrays.asList(presidentsArray);
		List<String> cars = Arrays.asList(carCompaniesArray);

		//Launch Main Menu
		mainMenu();
		
		do
		{
			selection = 0;
			selection = intake.nextInt(); 
			
			switch(selection){
			
			case 1: { 
						topicMenu1();
						selection = intake.nextInt();
					} 
					break;
			
			case 2: selection = RandNumber(1,3);
					break;
			
			case 3: selection = 4; 
					break;
			
			default: mainMenu();
			}
			
			
			switch(selection)
			{
			case 1: startGame(sports,sportsArray); break;
			
			case 2: startGame(presidents,presidentsArray); break;
			
			case 3: startGame(cars,carCompaniesArray); break;
			
			case 4: finished = false; break;
			
			default: selection = intake.nextInt();
			}
			
		}while(finished);
		
		
		
	}

}
