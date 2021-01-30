
public class Game 
{
	private char xo;
	private String spot1 = " ";
	private String spot2 = " ";
	private String spot3 = " ";
	private String spot4 = " ";
	private String spot5 = " ";
	private String spot6 = " ";
	private String spot7 = " ";
	private String spot8 = " ";
	private String spot9 = " ";
	private int randomSpot = 0;
	
	
	//Game Board labeled with numbers
	public void gameBoardNum()
	{
		String[][] gameBoardNum = {{"1","|","2","|","3","\n"},
						{"-","+","-","+","-","\n"},
						{"4","|","5","|","6","\n"},
						{"-","+","-","+","-","\n"},
						{"7","|","8","|","9","\n"}};
		for (int r = 0; r < 5; r++)
		{
			for (int c = 0; c < 6; c++)
			{
				System.out.print(gameBoardNum[r][c]);
			}
		}
	}
	
	
	//interactive Game Board
	public void play()
	{
		String[][] gameBoardNum = {{spot1,"|",spot2,"|",spot3,"\n"},
				{"-","+","-","+","-","\n"},
				{spot4,"|",spot5,"|",spot6,"\n"},
				{"-","+","-","+","-","\n"},
				{spot7,"|",spot8,"|",spot9,"\n"}};
		for (int r = 0; r < 5; r++)
		{
			for (int c = 0; c < 6; c++)
			{
		System.out.print(gameBoardNum[r][c]);
			}
		}
	}
	
	
	//double checking if spot is taken
	public boolean isTaken(int theNextMove)
	{
		if (theNextMove == 1)
		{
			if (spot1.equals("X") || spot1.equals("O"))
			{
				return true;
			}
			else return false;
		}
		else if (theNextMove == 2)
		{
			if (spot2.equals("X") || spot2.equals("O"))
			{
				return true;
			}
			else return false;
		}
		else if (theNextMove == 3)
		{
			if (spot3.equals("X") || spot3.equals("O"))
			{
				return true;
			}
			else return false;
		}
		else if (theNextMove == 4)
		{
			if (spot4.equals("X") || spot4.equals("O"))
			{
				return true;
			}
			else return false;
		}
		else if (theNextMove == 5)
		{
			if (spot5.equals("X") || spot5.equals("O"))
			{
				return true;
			}
			else return false;
		}
		else if (theNextMove == 6)
		{
			if (spot6.equals("X") || spot6.equals("O"))
			{
				return true;
			}
			else return false;
		}
		else if (theNextMove == 7)
		{
			if (spot7.equals("X") || spot7.equals("O"))
			{
				return true;
			}
			else return false;
		}
		else if (theNextMove == 8)
		{
			if (spot8.equals("X") || spot8.equals("O"))
			{
				return true;
			}
			else return false;
		}
		else if (theNextMove == 9)
		{
			if (spot9.equals("X") || spot9.equals("O"))
			{
				return true;
			}
			else return false;
		}
		else return true;
	}
	
	//Setting the Board according to user's input
	public void set1()
	{
		spot1 = "X";
	}
	public void set2()
	{
		spot2 = "X";
	}
	public void set3()
	{
		spot3 = "X";
	}
	public void set4()
	{
		spot4 = "X";
	}
	public void set5()
	{
		spot5 = "X";
	}
	public void set6()
	{
		spot6 = "X";
	}
	public void set7()
	{
		spot7 = "X";
	}
	public void set8()
	{
		spot8 = "X";
	}
	public void set9()
	{
		spot9 = "X";
	}
	
	
	//Setting the Board according to opponent's input
	public void set21()
	{
		spot1 = "O";
	}
	public void set22()
	{
		spot2 = "O";
	}
	public void set23()
	{
		spot3 = "O";
	}
	public void set24()
	{
		spot4 = "O";
	}
	public void set25()
	{
		spot5 = "O";
	}
	public void set26()
	{
		spot6 = "O";
	}
	public void set27()
	{
		spot7 = "O";
	}
	public void set28()
	{
		spot8 = "O";
	}
	public void set29()
	{
		spot9 = "O";
	}
	
	
	//Enemy's move
	public void enemyMove()
	{
		//picking a spot not occupied
		int i = 0;
		while (i != 7)
		{
			randomSpot = 1+(int)(9*(Math.random())); //random # between 1 and 9
			if ((randomSpot == 1) && (spot1.equals(" ")))
			{
				set21();
				i = 7;
			}
			if ((randomSpot == 2) && (spot2.equals(" ")))
			{
				set22();
				i = 7;
			}
			if ((randomSpot == 3) && (spot3.equals(" ")))
			{
				set23();
				i = 7;
			}
			if ((randomSpot == 4) && (spot4.equals(" ")))
			{
				set24();
				i = 7;
			}
			if ((randomSpot == 5) && (spot5.equals(" ")))
			{
				set25();
				i = 7;
			}
			if ((randomSpot == 6) && (spot6.equals(" ")))
			{
				set26();
				i = 7;
			}
			if ((randomSpot == 7) && (spot7.equals(" ")))
			{
				set27();
				i = 7;
			}
			if ((randomSpot == 8) && (spot8.equals(" ")))
			{
				set28();
				i = 7;
			}
			if ((randomSpot == 9) && (spot9.equals(" ")))
			{
				set29();
				i = 7;
			}
		}
	}
	
	//Result
	public String result()
	{
			if ((spot1.equals("X") && spot2.equals("X") && spot3.equals("X")) ||
				(spot1.equals("X") && spot5.equals("X") && spot9.equals("X")) ||
				(spot4.equals("X") && spot5.equals("X") && spot6.equals("X")) ||
				(spot7.equals("X") && spot8.equals("X") && spot9.equals("X")) ||
				(spot3.equals("X") && spot5.equals("X") && spot7.equals("X")) ||
				(spot1.equals("X") && spot4.equals("X") && spot7.equals("X")) ||
				(spot2.equals("X") && spot5.equals("X") && spot8.equals("X")) ||
				(spot3.equals("X") && spot6.equals("X") && spot9.equals("X")) ) 
			{
				return "Good Job You win !";
			}
			if ((spot1.equals("O") && spot2.equals("O") && spot3.equals("O")) ||
				(spot1.equals("O") && spot5.equals("O") && spot9.equals("O")) ||
				(spot4.equals("O") && spot5.equals("O") && spot6.equals("O")) ||
				(spot7.equals("O") && spot8.equals("O") && spot9.equals("O")) ||
				(spot3.equals("O") && spot5.equals("O") && spot7.equals("O")) ||
				(spot1.equals("O") && spot4.equals("O") && spot7.equals("O")) ||
				(spot2.equals("O") && spot5.equals("O") && spot8.equals("O")) ||
				(spot3.equals("O") && spot6.equals("O") && spot9.equals("O"))) 
			{
				return "The computer is smarter than you ya looser ahah, you lost";
			}
			else return " ";
	}
}

	


