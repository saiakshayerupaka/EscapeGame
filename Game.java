package escape;
import java.util.*;
public class Game {
	static int energy=200,time=200,skipOptions=1;/* energy is initialized to 200 which is the intial energy.energy variable is used to store the energy of the player through the game
	 												time is initialized to 200 which is the intial time. time variable is used to store the time remaining time of the user
	 												skipOptions is used the number of skip options the player has left with */
	String playerName;/*used to store playername*/
	int check=0;/*used to check if the time is completed.*/
	public Game(String playerName, String playerGender,String playerAge){
		/*
		  used to assign value to the Game class variable 
		 */
		this.playerName=playerName;
		System.out.println("Hai  "+playerName+"  you are a  "+playerGender+"  you are "+playerAge+"years old \n you must be dare enough to play these adventure games");
	}


	public void game(){
		/*the game() method is written to start the game and creates obstacles by different classes

		 */
		RoomObstacleGenerartor rObstacle= new RoomObstacleGenerartor();
		FieldObstacleGenerator fObstacle=new FieldObstacleGenerator();
		System.out.println("\nGET READY "+playerName+"\n");


		for(int i=0;i<11;i++) {
			System.out.println("--------------------------------------------------------\nRoom:"+(i+1)+"\n");
			if(energy>0&&time>0) {/*checking if the player has energy and time remaining*/
				rObstacle.generateRoomObstacles();	}
			else if(energy<=0) {
				System.out.println("your energy has been exhausted sorry you failed to complete the game");
				break;	
			}
			else{
				System.out.println("your time has completed sorry you failed to complete the game you have crossed "+i+"rooms");
				check=1;
				break;

			}
		}
		if(check==0) {
			System.out.println("Congratulations you have completed all the Room Obstacles\n-------------------------------------------- \nthe energy level left is"+Game.energy+" Time left is "+Game.time);


			System.out.println("Play a lucky lottery game pick a number in 0,1,2,3\n if your number gets picked your time and energy will be boosted by 40");

			Random random=	new Random();
			Scanner input = new Scanner(System.in);
			try {
				int yourChoice=input.nextInt();
				int lotteryResult=random.nextInt(4);
				if(yourChoice==lotteryResult){
					System.out.println("Yes you have won the lottery\n Congratulations\nyour time and energy will be boosted by 40");	
					time+=40;
					energy+=40;
				}
				else {
					System.out.println("Sorry the number is not picked\nthe number picked is "+lotteryResult);
				}
			}
			catch(Exception e) {
				System.out.println("\n\ndont act smart you were asked to enter an number\n you lost your lucky chance\n\n");

			}



			for(int i=0;i<4;i++) {
				System.out.println("Field"+(i+1)+"\n");
				if(energy>0&&time>0) {
					fObstacle.generateFieldObstacles();}
				else if(energy<=0) {
					System.out.println("\nyour energy has been exhausted sorry you failed to complete the game");
					break;	
				}
				else{
					System.out.println("\nyour time has completed sorry you failed to complete the game you have crossed 11 rooms and "+(i+1)+"fields");
					break;
				}

			}


			input.close();
		}
	}
}
