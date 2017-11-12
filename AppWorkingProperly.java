package monthyHall;

import java.util.Random;
import java.util.Scanner;

public class AppWorkingProperly {
	private static int counterWin = 0;
	private static int counterLoose = 0;
	private static int rightDoor;
	private static Scanner sc1;
	private static Scanner sc2;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int i;
		for (i = 1; i <= 10000; i++) {

			sc1 = new Scanner(System.in);
			Random rand = new Random();
			rightDoor = rand.nextInt(3) + 1;
			//System.out.println("The right door " + rightDoor);
			//System.out.println("Which door would you like to pick?");
			int Chosendoor = rand.nextInt(3) + 1;
			chooseDoor(Chosendoor);
		}
		System.out.println("Win: " + counterWin + " Loose: " + counterLoose);
		float percentage = counterWin;
		i--;
		System.out.println("value of " +i);
		System.out.println(percentage / i * 100 + "% win rate");

		long end = System.currentTimeMillis();
		System.out.println((end - start) + " ms");
	}

	public static void chooseDoor(int i) {
		Random rand = new Random();
		Scanner sc2 = new Scanner(System.in);
		int Chosendoor = 1;

		int goat = rand.nextInt(3) + 1;

		if (i == rightDoor) {
			while (goat == i) {
				goat = rand.nextInt(3) + 1;
			}
		} else {
			while (goat != rightDoor || goat == i) {
				goat = rand.nextInt(3) + 1;
			}
		}
		//System.out.println("Would you stay in " + i + " or would you switch to " + goat);
		Chosendoor = goat;
		if (Chosendoor == rightDoor) {
			//System.out.println("You win");
			counterWin++;
		} else {
			//System.out.println("you loose");
			counterLoose++;
		}

	}
}
