import java.util.Scanner;
public class TicTacToe
{

	public static void main(String[] args) 
	{
		Scanner Keyboard = new Scanner (System.in);
		
		
		//Welcome message
		System.out.println("*****************************************");
		System.out.println("*                                       *");
		System.out.println("* Welcome to Arsany's TicTacToe Game :) *");
		System.out.println("*                                       *");
		System.out.println("*****************************************");
		System.out.println("");
		
		
		//Actual Game
		int loopBreak = 0;
		Game game1 = new Game();
		game1.gameBoardNum(); //the game board labeled
		System.out.println("Alright, you are playing with X, you start first");
		
		//Game loop
		for(int i = 0; i < 6; i++)
		{
			System.out.println("");
			System.out.print("Please select your next move (type a # between 1 and 9): ");
			System.out.println("");
			int nextMove = Keyboard.nextInt();
			if (game1.isTaken(nextMove) == true)
			{
				System.out.println("this spot is taken, please try again !");
				nextMove = 10;
			}
			
			switch (nextMove)
			{
			case 1:
				game1.set1();
				break;
			case 2:
				game1.set2();
				break;
			case 3:
				game1.set3();
				break;
			case 4:
				game1.set4();
				break;
			case 5:
				game1.set5();
				break;
			case 6:
				game1.set6();
				break;
			case 7:
				game1.set7();
				break;
			case 8:
				game1.set8();
				break;
			case 9:
				game1.set9();
				break;
			case 10:
				i--;
				loopBreak = 5;
				break;
				
			}
			if (loopBreak !=5)
			{
				game1.play();
				game1.enemyMove();
				System.out.println("");
				System.out.println("Your opponent's turn: ");
				System.out.println("");
				game1.play();
				System.out.println(game1.result());
				if ((game1.result()).equals("Good Job You win !") || 
					(game1.result()).equals("The computer is smarter than you ya looser ahah, you lost"))
						System.exit(0);
			}
			loopBreak = 0;
		}
		
		//End the game
		System.out.println("The game is drawn!");
		System.exit(0);
		
	
		Keyboard.close();
	}	

}


