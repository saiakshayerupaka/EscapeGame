package escape;
import java.util.Scanner;
/**
 * Date 14-02-2020
 * @author Sai Akshay Erupaka(1992619)
 * @author Gopi Chand Kandula(1993584)
 * @author Chintan Dankhara(1992663) 
 *@
 */
public class Esacape {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("this is an adventure game where the player has to cross 11 rooms and 4fields within the given time of 200units and energy of 200units as well You will have one skip option \nevery option you select will will consume appropiate energy and time\nyour job is to select the option which consumes least energy and time and complte the game with 200 energy and 200 time\n");
		System.out.println("Enter the Player Name\n ");
		String playerName = in.nextLine();	/* playerName is used to store player name*/	
		System.out.println("Enter age");
		String playerAge = in.nextLine();/*playerAge is used to store player age*/
		System.out.println("enter gender");
		String playerGender = in.nextLine();/*playerGender is to store player gender*/
		Game game=new Game(playerName,playerGender,playerAge);
		game.game();
		in.close();


	}

}
