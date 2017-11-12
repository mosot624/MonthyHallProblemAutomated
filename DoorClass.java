package monthyHall;

import java.util.Random;

public class DoorClass {
	public static void main(String[] args) {
		Random rand = new Random();
		int i;
		int counter = 0;
		for (i = 0; i <= 10000; i++) {
			int n = rand.nextInt(2) + 1;
			if(n==1){
				counter++;
			}
			else{
				
			}
		}
		float j = i;
		System.out.println(counter/j*100);
	}

}
