package escape;



public class ObstacleDetails {
	public class RoomObstacleDetails{
		int a=10;
		/**
		 * roomObstacleDetails is an two dimensional array of strings used to store the content of room obstacles and the energy that will consume if the user enters an option
		 */
		String roomObstacleDetails[][]={ 
				{"There is an fire in the entire room how will you go to the next room choose one of the following options\n1.Search for extinguisher\n2.Use a cloth to go through the fire\n3.Go directly through fire","30","10","20","20","10","30"},
				{"The room is completely filled with water how will you go to the next room choose one of the following options\n1.Swim and cross\n2.Search to drain the water\n3.skip","10","10","20","20","0","0"},
				{"Energy exhausted and you need to climb a 30 feet wall to go to the next room how will you go to the next room choose one of the following options\n1.Search for items and prepare the food and eat\n2.Eat instant food","20","20","5","15"},
				{"The room is filled with smoke how will you cross the room\nhow will you go to the next room choose one of the following options\n1.search for cloth and cover your mouth\n2.Go directly\n3.skip","20","10","10","30","0","0"},
				{"The room is filled with enemies how will you go to the next room choose one of the following options\n1.kill everyone and go\n2.try to convince","30","30","15","5"},
				{"You have to solve the puzzle below to cross the room\nhow will you go to the next room choose one of the following options\n1.Solve puzzle\n2.skip","10","10","0","0"},
				{"there is an hole in the room how will you go to the next room choose one of the following options\n1.jump\n2.try to make a passage\n3.skip","10","20","20","5","0","0"},
				{"there is an cage to go to the next room you have to go through the cage how will you go to the next room choose one of the following options\n1.try to break through\n2.wait for the cage to open it opens in 40 seconds\n3.skip","10","30","40","0","0","0"},
				{"the floor in the room is slippery how will you go to the next room choose one of the following options\n1.go slow\n2.carry on\n3.skip","20","5","5","10","0","0"},
				{"the ceiling in the room is falling how will you go to the next room choose one of the following options\n1.go under a table\n2.try to escape the falling patches and go","20","20","5","30"},
				{"there are two narrow passages to cross the room you have to go through them how will you go to the next room choose one of the following options\n1.go slowly with balancing on one passage\n2.go fastly on two passages","30","20","20","10"}
		};
	}
	class FieldObstacleDetails
	{/**
	 * fieldObstacleDetails is an two dimensional array of strings used to store the content of field obstacles and the energy that will consume if the user enters an option
	 */
		public String fieldObstacleDetails[][]={ 	
				{"In the open field there is acid rain how will you go through it\n1.go in the rain\n2. hide under any thing ","10","0"},
				{"it is very cold in this field you have to sustain it for sometime how will you do that\n1.set campfire\n2.drink bear","0","10"},
				{"there is an snow storm in the field how will you go through it\n1. wait until the snow storm goes away\n2.use umbrella","0","10"},
				{"you have to climb a hill there is a snow storm and thundering rain going on you have to go through it choose the correct vehicle to go to top the top of the hill where the game ends\n1.car\n2.bus","40","0"}
		};

	}
}
