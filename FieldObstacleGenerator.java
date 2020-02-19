package escape;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import escape.ObstacleDetails.FieldObstacleDetails;




public class FieldObstacleGenerator implements FieldObstacles{
	Scanner input = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<Integer>();


	@Override
	public int generateFieldObstacles() {/*generates the random id of the obstacle and gets the details of the obstacles */
		int a;/*variable a is used to accept the random value of the id of the obstacle*/


		Random random=	new Random();
		a=random.nextInt(4);
		while(list.indexOf(a)!=-1) {
			a=random.nextInt(4);
		}
		list.add(a);
		ObstacleDetails obstacleDetails=new ObstacleDetails();
		FieldObstacleDetails fieldObstacleDetails= obstacleDetails.new FieldObstacleDetails();
		String choosedOptionDetails[] = fieldObstacleDetails.fieldObstacleDetails[a];
		System.out.println(choosedOptionDetails[0]);
		System.out.println("two options are available\n");

		int choosedOption=0,check=0;/*choosedOption is used for storing the option the user has entered 
		 							check variable is used as a flag variable for seeing whethger the exception has been raised or not
		 */
		while(true) {/*checking if valid input is given or not*/
			while(true) {
				try {
					System.out.println("\nenter the option that you want to select\n");	
					choosedOption=Integer.parseInt(input.nextLine());
					check=1;
				}
				catch (Exception ex) {
					System.out.println("please enter an proper number");
					check=0;

				}
				if (check==1)
					break; 
			}

			if(choosedOption>=3|| choosedOption<=0) {
				System.out.println("please enter an number between 1 and 2 ");
				continue; 
			}
			break;

		}







		Game.energy-=Integer.parseInt(choosedOptionDetails[(choosedOption)]);
		Game.time-=10;
		System.out.println("\nenergy"+Game.energy);
		System.out.println("\ntime"+Game.time);



		return a;	
	}



}
