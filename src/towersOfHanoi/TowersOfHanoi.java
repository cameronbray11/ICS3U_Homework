package towersOfHanoi;

import java.util.Scanner;

public class TowersOfHanoi {
	
	
	static int numDisks;
	static int num1;
	static int num2;
	static int num3;
	static int numMoves;
	private static Scanner scanner;
	static boolean H1 = false;
	static boolean H2 = false;
	static boolean H3 = false;
	public static int [] size;
	public static int [] disks;
	
	
	public static void main(String[] args) {
	
	scanner = new Scanner (System.in);
	System.out.println("Input the number of Disks : ");
	numDisks = scanner.nextInt();
	
	num1 = numDisks;
	numMoves = (int) (Math.pow(numDisks, 2)-1);

	disks = new int[numDisks + 1];
	for (int i = 1; i <= numDisks; i++){
		disks [i] = 1;
		System.out.println(disks[i]);
	}
	
	
	}
	
	public void legalMove(){
	}
}
