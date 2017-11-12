package monthyHall;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ThreadedMonthyHall {
	private static int counterWin = 0;
	private static int counterLoose = 0;
	private static int rightDoor;
	private static Scanner sc1;
	private static Scanner sc2;
	static int i;
	static int j;
	static int overAllValue = 10000;
	static int threadLoopValue = overAllValue/2;

	
	List<Integer> list1 = new ArrayList<Integer>();



	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		twoThreadsCombined();
		
		System.out.println("Win: " + counterWin + " Loose: " + counterLoose);
		float percentage = counterWin;
		i--;
		j--;
		System.out.println(percentage / (i+j) * 100 + "% win rate");

		long end = System.currentTimeMillis() - start;
		System.out.println(end + " ms");
	}

	public static void chooseDoor(int i) {
		Random rand = new Random();
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
	public static void chooseDoorT2(int i) {
		Random rand = new Random();
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
	/*private static void ChoosingDoorPart(){
		for (i = 1; i <= 1000; i++) {
			sc1 = new Scanner(System.in);
			Random rand = new Random();
			rightDoor = rand.nextInt(3) + 1;
			//System.out.println("The right door " + rightDoor);
			//System.out.println("Which door would you like to pick?");
			int Chosendoor = rand.nextInt(3) + 1;
			chooseDoor(Chosendoor);
		}
	}*/
	private static void twoThreadsCombined(){
		Thread t1 = new Thread(new Runnable() {

			public void run() {
				for (i = 1; i <= threadLoopValue; i++) {
					sc1 = new Scanner(System.in);
					Random rand = new Random();
					rightDoor = rand.nextInt(3) + 1;
					//System.out.println("The right door " + rightDoor);
					//System.out.println("Which door would you like to pick?");
					int Chosendoor = rand.nextInt(3) + 1;
					chooseDoor(Chosendoor);
				}

			}

		});
		t1.start();
		Thread t2 = new Thread(new Runnable() {

			public void run() {
				for (j = 1; j <= threadLoopValue; j++) {
					sc1 = new Scanner(System.in);
					Random rand = new Random();
					rightDoor = rand.nextInt(3) + 1;
					//System.out.println("The right door " + rightDoor);
					//System.out.println("Which door would you like to pick?");
					int Chosendoor = rand.nextInt(3) + 1;
					chooseDoorT2(Chosendoor);
				}

			}

		});
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
