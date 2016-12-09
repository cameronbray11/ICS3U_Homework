package chapter_5;

import java.util.Scanner;

public class HW5_1 {

	public static Scanner numDisk;
	public static int [] x;

	public static void main(String[] args) {

		int [] y;
		int [] z;
		
		numDisk = new Scanner (System.in);
		System.out.println("Hi");
		int numberOfDisks = numDisk.nextInt();
		
		
		for (int i = 1; i <= numberOfDisks; i++){
			x [i] = i;
		}

	}

}
