package monthyHall;

import java.util.Random;
import java.util.Scanner;

public class App3 {
	static int counterWin = 0;
	static int counterLoose = 0;
	static int rightDoor;
	static int Chosendoor;
	private static Scanner sc2;
	private static Scanner sc1;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int i;
		for (i = 0; i <= 10000; i++) {

			sc1 = new Scanner(System.in);
			Random rand = new Random();
			rightDoor = rand.nextInt(3) + 1;
			System.out.println("The right door " + rightDoor);
			System.out.println("Which door would you like to pick?");
			int Chosendoor = sc1.nextInt();
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
		sc2 = new Scanner(System.in);
		int goat=rightDoor;
		if(i == rightDoor){
			do{
				goat = rand.nextInt(3)+1;
			}while(goat==i);
		}
			
			
		System.out.println("Would you stay in " + i + " or would you switch to " + goat);
		Chosendoor = sc2.nextInt();
		if (Chosendoor == rightDoor) {
			 System.out.println("You win");
			counterWin++;
		} else {
			 System.out.println("you loose");
			counterLoose++;
		}

	}
}
