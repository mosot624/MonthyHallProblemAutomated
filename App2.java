package monthyHall;

import java.util.Random;
import java.util.Scanner;

public class App2 {
	static int counterWin = 0;
	static int counterLoose = 0;
	static int rightDoor;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int i;
		for (i = 0; i <= 10000; i++) {

			Scanner sc1 = new Scanner(System.in);
			Random rand = new Random();
			rightDoor = rand.nextInt(3) + 1;
			// System.out.println("The right door " + rightDoor);
			// System.out.println("Which door would you like to pick?");
			int Chosendoor = rand.nextInt(3) + 1;
			chooseDoor(Chosendoor);
		}
		System.out.println("Win: " + counterWin + " Loose: " + counterLoose );
		float percentage = counterWin;
		System.out.println(percentage / i *100 + "% win rate");
		
		long end = System.currentTimeMillis();
		System.out.println((end - start) + " ms");
	}

	public static void chooseDoor(int i) {
		Random rand = new Random();
		Scanner sc1 = new Scanner(System.in);
		int goat;
		int Chosendoor = 1;

		int goat1 = rand.nextInt(2) + 1;
		
		if(goat1==1){
			goat = Chosendoor;
		}
		else{
			goat = rightDoor;
		}
			
			
		// System.out.println("Would you stay in " + i + " or would you switch
		// to " + goat);
		Chosendoor = goat;
		if (Chosendoor == rightDoor) {
			// System.out.println("You win");
			counterWin++;
		} else {
			// System.out.println("you loose");
			counterLoose++;
		}

	}
}
