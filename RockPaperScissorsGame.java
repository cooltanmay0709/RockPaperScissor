import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		
		int MyCount = 0, CompCount = 0, Tie = 0;
		System.out.println("Rock Paper Scissors...!");
		System.out.println("\nSeries of 5 Sets");
		for(int i=1; i<6; ++i)
		{
			System.out.println("\n1. Rock"
					+ "\n2. Paper"
					+ "\n3. Scissor"
					+ "\nEnter Your Choice: ");
			Scanner obj = new Scanner(System.in);
			Random comp = new Random();
			int lowerbound = 1, upperbound = 4;
			int MyChoice = obj.nextInt();
			int CompChoice = comp.nextInt(lowerbound, upperbound);
			
			switch(MyChoice){
				case 1:
					System.out.println("You Choosed Rock");
					break;
				case 2:
					System.out.println("You Choosed Paper");
					break;
				case 3:
					System.out.println("You Choosed Scissor");
					break;
				default : 
					System.out.println("Invalid Choice...!");
					CompCount++;
					break;
			}
			
			switch(CompChoice){
			case 1:
				System.out.println("Computer Choosed Rock");
				break;
			case 2:
				System.out.println("Computer Choosed Paper");
				break;
			case 3:
				System.out.println("Computer Choosed Scissor");
				break;
			default : 
				System.out.println("Invalid Choice...!");
				MyCount++;
				break;
			}
			
			if((CompChoice==1 && MyChoice==3) || (CompChoice==2 && MyChoice==1) || (CompChoice==3 && MyChoice==2)) {
				System.out.println("Computer Won...!");
				CompCount++;
			}
			else if((CompChoice==1 && MyChoice==2) || (CompChoice==2 && MyChoice==3) || (CompChoice==3 && MyChoice==1)) {
				System.out.println("You Won...!");
				MyCount++;
			}
			else {
				System.out.println("Tie...!");
				Tie++;
			}
			
			System.out.printf("Set %d Completed\n\n\n", i);
		}
		
		CompCount = CompCount + Tie;
		MyCount = MyCount + Tie;
		System.out.println("\n\n\nAll Sets Completed...!");
		System.out.printf("Result: \nYour Score is: %d \nComputer's Score is: %d \nNo. of Sets Tied are: %d\n", MyCount, CompCount, Tie);
		if(CompCount > MyCount) {
			System.out.println("Computer Won The Series...!");
			System.out.println("Bad Luck...! Try Next Time.");
		}
		else if(MyCount > CompCount) {
			System.out.println("Congratulations...!\nYou Won The Series...!");
		}
		else {
			System.out.println("Series Tied...!");
			System.out.println("Better Luck...! Try Next Time.");
		}
	}
}
