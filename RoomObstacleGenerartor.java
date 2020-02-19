package escape;
import java.util.*;
import escape.ObstacleDetails.RoomObstacleDetails;

public class RoomObstacleGenerartor implements RoomObstacles {
	Scanner input = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<Integer>();



	@Override
	public void generateRoomObstacles() {/*generates the random id of the obstacle and returns the obstacle */
		int a;/*variable a is used to accept the random value of the id of the obstacle*/
		Random random=	new Random();
		a=random.nextInt(11);
		while(list.indexOf(a)!=-1) {
			a=random.nextInt(11);
		}
		list.add(a);
		ObstacleDetails obstacleDetails=new ObstacleDetails();
		RoomObstacleDetails roomObstacleDetails= obstacleDetails.new RoomObstacleDetails();
		String choosedOptionDetails[] = roomObstacleDetails.roomObstacleDetails[a];/*choosedOptionDetails slices only the details of the present obstacle */
		System.out.println(choosedOptionDetails[0]);
		int obstacleOptionCount=(choosedOptionDetails.length-1)/2;/*obstacleOptionCount is used to store number of options are available*/
		System.out.println("number of options available is"+obstacleOptionCount+"\n");
		System.out.println("\nenter the option that you want to select\n");
		int choosedOption=0;/*used to store the option entered by the player*/
		while(true) {/*checking if valid input is given or not*/
			while(true) {
				try {
					choosedOption=Integer.parseInt(input.nextLine());
				}
				catch (Exception ex) {
					System.out.println("please enter an proper number");
					continue;

				}
				break; 
			}

			if(choosedOption>obstacleOptionCount|| choosedOption<1) {
				System.out.println("please enter an number between 1 and "+obstacleOptionCount);
				continue; 
			}



			if(((choosedOption==3) && (a==1||a==3||a==6||a==7||a==8))||(choosedOption==2 && a==5)) { 
				if(Game.skipOptions==1) {
					Game.skipOptions-=1;
				}
				else{
					System.out.println("Your skip options are finished please choose another option");
					continue;


				}      
			}
			break;
		}
		System.out.println("the time consumed for the act is"+choosedOptionDetails[(2*choosedOption-1)]+"\nthe energy consumed is"+choosedOptionDetails[(2*choosedOption)]);
		Game.energy-=Integer.parseInt(choosedOptionDetails[(2*choosedOption)]);
		Game.time-=Integer.parseInt(choosedOptionDetails[(2*choosedOption-1)]);
		System.out.println("\nenergy left"+Game.energy);
		System.out.println("\ntime leftz"+Game.time);
		}
}










